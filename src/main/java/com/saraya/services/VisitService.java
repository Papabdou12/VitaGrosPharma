package com.saraya.services;

import com.saraya.model.Visit;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.time.LocalDate.of;

public class VisitService {
    private static  List<Visit> visits = new ArrayList<>();
    private static int id = 0;

   static {
       visits.add(new Visit(generateId(), LocalDate.of(2022,5,11),"null"));
   }

    public List<Visit> getVisits(){
        return visits;
    }

    public Visit getVisits(String id) {
        int deptPosition = visits.indexOf(new Visit(id));
        return visits.get(deptPosition);
    }

    public Visit createVisits(LocalDate date,String description) {
        Visit v = new Visit(generateId(), date, description);
        visits.add(v);
        return v;
    }

    public static String generateId(){
        return "N°_" + ++id;
    }

    public void update(String id, LocalDate date,String description) {
       Visit v= getVisits(id);
        v.setDate(date);
        v.setDescription(description);
        int index = visits.indexOf(new Visit(id));
        visits.set(index, v);
    }

    public void delete(String id) {
        visits.remove(new Visit(id));
    }
}
