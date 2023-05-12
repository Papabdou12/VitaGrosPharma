package com.saraya.services;

import com.saraya.model.PetType;

import java.util.ArrayList;
import java.util.List;

public class PetTypeService {
    PetType p = new PetType();
    private static List<PetType> petTypes = new ArrayList<>();
    private static int id = 0;

    static {
        petTypes.add(new PetType(generateId(),"Jig"));
    }

    public List<PetType> getPetTypes(){
        return petTypes;
    }

    public PetType getPetTypes(String id) {
        int deptPosition = petTypes.indexOf(new PetType(id));
        return petTypes.get(deptPosition);
    }

    public PetType createPetType(String name) {
        PetType pt = new PetType(generateId(), name);
        petTypes.add(pt);
        return pt;
    }

    public static String generateId(){
        return "N°_" + ++id;
    }

    public void update(String id, String name) {
       PetType pt= getPetTypes(id);
        pt.setName(name);
        int index = petTypes.indexOf(new PetType(id));
        petTypes.set(index, pt);
    }

    public void delete(String id) {
        petTypes.remove(new PetType(id));
    }
}
