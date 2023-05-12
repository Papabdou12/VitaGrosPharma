package com.saraya.controller;

import com.saraya.model.Visit;
import com.saraya.services.VisitService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

;

@Controller
@RequestMapping("/visits")
@SessionAttributes("username")
public class VisitController {
    private static final Log log = LogFactory.getLog( VisitController.class);
VisitService service = new VisitService();
    @RequestMapping
    public String VisitList(ModelMap model15) {
        model15.addAttribute("visit", service.getVisits());
        return "visitsList";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String create(@RequestParam("date") String date,
                         @RequestParam("description") String description
            , @RequestParam("id") String id){
        if (id.equals("")){
            Visit v= service.createVisits(LocalDate.parse(date),description);
        }else {
            service.update(id, LocalDate.parse(date),description);
        }
        return "redirect:/visits";
    }

    @RequestMapping(value = "/{id}")
    public String getVisits(@PathVariable("id") String id
            , ModelMap model) {
        model.addAttribute("visits", service.getVisits(id));
        return "visitsDetail";
    }

    @RequestMapping("/new")
    public String create() {
        return "visitsNew";
    }

    @RequestMapping("/update/{id}")
    public String update(@PathVariable String id, ModelMap model) {
        model.put("visits", service.getVisits(id));
        return "visitsNew";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable String id) {
        service.delete(id);
        return "redirect:/visits";
    }

}
