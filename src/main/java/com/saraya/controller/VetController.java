package com.saraya.controller;

import com.saraya.dto.VetDto;
import com.saraya.model.Vet;
import com.saraya.services.SpecialityService;
import com.saraya.services.VetService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/vets")
@SessionAttributes("username")
public class VetController {
    private static final Log log = LogFactory.getLog( VetController.class);
    Vet vet = new Vet();



 private static VetService service= new VetService();
  private static SpecialityService serviceSP = new SpecialityService();

    @RequestMapping
    public String ownersList(ModelMap model) {
        model.addAttribute("vets", service.getVets());
        model.addAttribute("specialities",serviceSP.getSpecialities());
        return "vetList";
    }


    @RequestMapping(method = RequestMethod.POST)
    public String create(@ModelAttribute("vetDto") @Valid VetDto dto,
                         BindingResult result){

        if (result.hasErrors()){
            return "vetNew";
        }
        service.createVet(dto);
        return "redirect:/vets";
    }

    @RequestMapping(value = "/details/{id}")
    public String getOwner(@PathVariable("id") String id
            , ModelMap model) {
        model.addAttribute("detailsVets", service.getVets((id)));
        return "vetDetails";
    }

    @RequestMapping(value = "/new")
    public String create(ModelMap model) {
        model.put("specialities", serviceSP.getSpecialities());
        model.put("vetDto", new VetDto());
        return "vetNew";
    }

    @RequestMapping("/update/{id}")
    public String update(@PathVariable String id , ModelMap model) {
        model.put("vets", service.getVets(id));
        model.put("specialities", serviceSP.getSpecialities());
        return "vetNew";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable String id) {
        service.deleteVet(id);
        return "redirect:/vets";
    }

}
