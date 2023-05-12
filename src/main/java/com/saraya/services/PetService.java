package com.saraya.services;

import com.saraya.controller.PetController;
import com.saraya.dto.PetDto;
import com.saraya.model.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;

public class PetService {
    Pet p = new Pet();
    private static List<Pet> pets = new ArrayList<>();
 static  VisitService serviceV = new VisitService();
 static PetTypeService serviceP = new PetTypeService();

    private static int id= 0;

    static {
        PetType pt = new PetType();
        Visit v= new Visit();
        pets.add(new Pet(generateId(), "Lucky", LocalDate.of(2022, 1, 20),
                List.of(new PetType(pt.getName())), List.of(new Visit(v.getDescription()))));
    }


    public static String generateId(){
        return "N°" + ++id;
    }

    public List<Pet> getPets(){
        return pets;
    }

    public Pet getPets(String id) {
//        int deptPosition = pets.indexOf(new Pet(id));
//       return pets.get(pets.indexOf(new Pet(generateId())));
//        return pets.stream().filter(e -> e.equals(new Owner(id))).collect(Collectors.toList()).get(0);
        Pet pet = new Pet();
        for (Pet p : pets) {
            if (p.getId().equals(id))
                pet = p;
        }
        return pet;
    }

    public void createPets(PetDto dto) {
        Pet pet = new Pet(generateId());
        pet.setName(dto.getName());
        pet.setDateOfBirth(dto.getDateOfBirth());
        pet.setPetType((List<PetType>) serviceP.getPetTypes(dto.getId()));
        pet.setVisits((List<Visit>) serviceV.getVisits(dto.getId()));
        pets.add(pet);
    }




    public void deletePet(String id) {
        pets.remove(new Pet(id));
    }
    public void update(String id,String name, LocalDate dateOfBirth, PetType petType, Visit visits) {
        Pet pet = getPets(id);
        pet.setPetType((List<PetType>) petType);
        pet.setVisits((List<Visit>) visits);
        pets.set(pets.indexOf(new Pet(id)), pet);
    }




}
