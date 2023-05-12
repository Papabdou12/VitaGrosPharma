package com.saraya.controller;

import com.saraya.dto.OwnerDto;
import com.saraya.dto.PetDto;
import com.saraya.model.Owner;
import com.saraya.model.PetType;
import com.saraya.model.Visit;
import com.saraya.services.OwnerService;
import com.saraya.services.PetService;
import com.saraya.services.PetTypeService;
import com.saraya.services.VisitService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;

@Controller
@RequestMapping("/pets")
@SessionAttributes("username")
public class PetController {
    private static final Log log = LogFactory.getLog(PetController.class);
//    @Autowired
// static PetTypeService serviceP;
//  static VisitService serviceV;
//  static  PetService service ;
  private static  PetTypeService serviceP = new PetTypeService();
    private static  VisitService serviceV = new VisitService();
    private static  PetService service= new PetService() ;

@RequestMapping
    public String PetsList(ModelMap model) {
    model.addAttribute("pets", service.getPets());
        model.addAttribute("petTypes", serviceP.getPetTypes());
     model.put("visits", serviceV.getVisits());
        return "petsList";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String create(@ModelAttribute("petDto") @Valid PetDto dto,
                         BindingResult result){

        if (result.hasErrors()){
            return "petNew";
        }
        service.createPets(dto);
        return "redirect:/pets";
    }

    @RequestMapping(value = "/{id}")
    public String getPets(@PathVariable("id") String id
            , ModelMap model) {
        model.addAttribute("pets", service.getPets(String.valueOf(Integer.parseInt(id))));
        return "petDetail";
    }

    @RequestMapping("/new")
    public String create(ModelMap model) {
        model.put("petType", serviceP.getPetTypes());
        model.put("visits", serviceV.getVisits());
        model.put("petDto", new PetDto());
        return "petNew";
    }

    @RequestMapping("/update/{id}")
    public String update(@PathVariable String id , ModelMap model) {
        model.put("pets", service.getPets(id));
        model.put("petType", serviceP.getPetTypes());
        model.put("visits", serviceV.getVisits());
        return "petNew";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable String id) {
        service.deletePet(id);
        return "redirect:/pets";
    }

}

