package com.saraya.services;


import com.saraya.dto.VetDto;
import com.saraya.model.Speciality;
import com.saraya.model.Vet;

import java.util.ArrayList;
import java.util.List;

public class VetService {
Vet v = new Vet();
    private static List<Vet> vets= new ArrayList<>();
   private static SpecialityService serviceSP = new SpecialityService();

    private static int id = 0;

    static {
       Speciality s = new Speciality();
        vets.add(new Vet(generateId(), "james", "carter ",List.of(new Speciality(s.getName()))));
//        vets.add(new Vet(generateId(), "Linda", "Douglas ",List.of(new Speciality(s.getName()))));
//        vets.add(new Vet(generateId(), "Sharon", "jenkins ",List.of(new Speciality(s.getName()))));
//        vets.add(new Vet(generateId(), "raphael", "ortega ",List.of(new Speciality(s.getName()))));
       }

    public static String generateId(){
        return "N°_" + ++id;
    }

    public List<Vet> getVets(){
        return vets;
    }

    public Vet getVets(String id) {
//        int deptPosition = owners.indexOf(new Owner(id));
//       return owners.get(owners.indexOf(new Owner(id)));
        //  return  owners.stream().filter(e -> e.equals(new Owner(id))).collect(Collectors.toList()).get(0);
        Vet vt = new Vet();
        for (Vet v : vets) {
            if (v.getId().equals(id))
                vt = v;
            return vt;
        }
        return vt;
    }
    public void createVet(VetDto dto) {
        Vet vet = new Vet(generateId());
        vet.setFirstName(dto.getFirstName());
        vet.setLastName(dto.getLastName());
        vet.setSpecialties(dto.getSpecialties());


        vets.add(vet);
    }


    public void updateVet(String id, String firstName, String lastName, Speciality specialities) {
        Vet vet = getVets(id);
        vet.setFirstName(firstName);
        vet.setLastName(lastName);
        vet.setSpecialties((List<Speciality>) specialities);
        vets.set(vets.indexOf(new Vet(id)), vet);
    }

    public void deleteVet(String id) {
        vets.remove(new Vet(id));
    }
}
