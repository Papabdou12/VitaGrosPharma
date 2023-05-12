package com.saraya.controller;


import com.saraya.model.Speciality;
import com.saraya.services.SpecialityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/specialities")
@SessionAttributes("username")
public class SpecialityController {
    SpecialityService service = new SpecialityService();

    @RequestMapping
    public String deptList(ModelMap model15) {
        model15.addAttribute("specialities", service.getSpecialities());
        return "SpList";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String create(@RequestParam("name") String name
            , @RequestParam("id") String id){
        if (id.equals("")){
            Speciality s = service.createSpeciality(name);
        }else {
            service.updateSpeciality(id, name);
        }
        return "redirect:/specialities";
    }

    @RequestMapping(value = "/{id}")
    public String getSpeciality(@PathVariable("id") String id
            , ModelMap model) {
        model.addAttribute("dept", service.getSpecialities(id));
        return "SpDetail";
    }

    @RequestMapping("/new")
    public String create() {
        return "SpNew";
    }

    @RequestMapping("/update/{id}")
    public String update(@PathVariable String id, ModelMap model) {
        model.put("specialities", service.getSpecialities(id));
        return "SpNew";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable String id) {
        service.deleteSpeciality(id);
        return "redirect:/specialities";
    }
}
