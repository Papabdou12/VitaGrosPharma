package com.saraya.services;

import com.saraya.model.Speciality;


import java.util.ArrayList;
import java.util.List;

public class SpecialityService {

    private static List<Speciality> specialities = new ArrayList<>();
    private static int id = 0;

    static {
        specialities.add(new Speciality(generateId(), "none"));

    }

    public List<Speciality> getSpecialities(){
        return specialities;
    }

    public Speciality getSpecialities(String id) {
        int deptPosition = specialities.indexOf(new Speciality(id));
        return specialities.get(deptPosition);
    }

    public Speciality createSpeciality(String name) {
        Speciality d = new Speciality(generateId(), name);
       specialities.add(d);
        return d;
    }

    public static String generateId(){
        return "DEPT_" + ++id;
    }

    public void updateSpeciality(String id, String name) {
        Speciality s = getSpecialities(id);
       s.setName(name);
        int index = specialities.indexOf(new Speciality(id));
        specialities.set(index, s);
    }

    public void deleteSpeciality(String id) {
        specialities.remove(new Speciality(id));
    }
}
