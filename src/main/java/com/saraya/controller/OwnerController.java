package com.saraya.controller;

import com.saraya.dto.OwnerDto;
import com.saraya.model.Owner;
import com.saraya.services.OwnerService;
import com.saraya.services.PetService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping(value = "/owners")
@SessionAttributes("username")
public class OwnerController {
    private static final Log log = LogFactory.getLog( OwnerController.class);
    Owner owner = new Owner();

//    @Autowired
//    static PetService servicePet ;
//    static  OwnerService service;


 private static   OwnerService service= new OwnerService();
  private static PetService servicePet = new PetService();

    @RequestMapping
    public String ownersList(ModelMap model) {
        model.addAttribute("owners", service.getOwners());
        model.addAttribute("pets",servicePet.getPets());
        return "ownersList";
    }


    @RequestMapping(method = RequestMethod.POST)
    public String create(@ModelAttribute("ownerDto") @Valid OwnerDto dto,
                         BindingResult result){

        if (result.hasErrors()){
            return "ownerNew";
        }
        service.createOwners(dto);
        return "redirect:/owners";
    }

    @RequestMapping(value = "/details/{id}")
    public String getOwner(@PathVariable("id") String id
            , ModelMap model) {
        model.addAttribute("detailsOwners", service.getOwners((id)));
        return "ownerDetails";
    }

    @RequestMapping(value = "/new")
    public String create(ModelMap model) {
        model.put("pets", servicePet.getPets());
        model.put("ownerDto", new OwnerDto());
        return "ownerNew";
    }

    @RequestMapping("/update/{id}")
    public String update(@PathVariable String id , ModelMap model) {
        model.put("owners", service.getOwners(id));
        model.put("pets", servicePet.getPets());
        return "ownerNew";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable String id) {
        service.deleteOwner(id);
        return "redirect:/owners";
    }

}
