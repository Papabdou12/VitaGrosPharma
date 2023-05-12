package com.saraya.services;

import com.saraya.dto.OwnerDto;
import com.saraya.dto.PetDto;
import com.saraya.model.Owner;
import com.saraya.model.Pet;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OwnerService {
Owner o = new Owner();
    private static List<Owner> owners = new ArrayList<>();
   private static PetService service = new PetService();
//    @Autowired
//  static PetService service ;
//    PetService service = new PetService();
//    public OwnerService(){
//        this.service =  service;
//    }
    private static int id = 0;

    static {
        Pet p = new Pet();
        owners.add(new Owner(generateId(), "Jeck", "junior", "KmU12", "Dakar", 773102654,List.of(new Pet(p.getName()))));
    }

    public static String generateId(){
        return "N°_" + ++id;
    }

    public List<Owner> getOwners(){
        return owners;
    }

    public Owner getOwners(String id) {
//        int deptPosition = owners.indexOf(new Owner(id));
//       return owners.get(owners.indexOf(new Owner(id)));
        //  return  owners.stream().filter(e -> e.equals(new Owner(id))).collect(Collectors.toList()).get(0);
        Owner ow = new Owner();
        for (Owner o : owners) {
            if (o.getId().equals(id))
                ow = o;
            return ow;
        }
        return ow;
    }
    public void createOwners(OwnerDto dto) {
        Owner owner = new Owner(generateId());
        owner.setFirstName(dto.getFirstName());
        owner.setLastName(dto.getLastName());
        owner.setAddress(dto.getAddress());
        owner.setCity(dto.getCity());
        owner.setTelephone(Integer.parseInt(dto.getTelephone()));

        owners.add(owner);
    }


    public void updateOwner(String id, String firstName, String lastName, String city,  String telephone, Pet pets) {
        Owner owner = getOwners(id);
        owner.setFirstName(firstName);
        owner.setLastName(lastName);
        owner.setCity(city);
        owner.setTelephone(Integer.parseInt(telephone));
        owner.setPets((List<Pet>) pets);
        owners.set(owners.indexOf(new Owner(id)), owner);
    }

    public void deleteOwner(String id) {
        owners.remove(new Owner(id));
    }
}
