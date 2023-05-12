package com.saraya.controller;

import com.saraya.model.PetType;
import com.saraya.services.PetTypeService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/petTypes")
@SessionAttributes("username")
public class PetTypeController {
    private static final Log log = LogFactory.getLog( PetTypeController.class);
PetTypeService service = new PetTypeService();
    @RequestMapping
    public String PetTypeList(ModelMap model15) {
        model15.addAttribute("petTypes", service.getPetTypes());
        return "petTypesList";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String create(@RequestParam("name") String name
            , @RequestParam("id") String id){
        if (id.equals("")){
            PetType pt= service.createPetType(name);
        }else {
            service.update(id, name);
        }
        return "redirect:/petTypes";
    }

    @RequestMapping(value = "/{id}")
    public String getDepartment(@PathVariable("id") String id
            , ModelMap model) {
        model.addAttribute("petTypes", service.getPetTypes(id));
        return "petTypeDetail";
    }

    @RequestMapping("/new")
    public String create() {
        return "petTypeNew";
    }

    @RequestMapping("/update/{id}")
    public String update(@PathVariable String id, ModelMap model) {
        model.put("petTypes", service.getPetTypes(id));
        return "petTypesNew";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable String id) {
        service.delete(id);
        return "redirect:/petTypes";
    }

}
