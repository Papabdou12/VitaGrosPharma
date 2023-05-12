package com.saraya.model;

import java.util.List;
import java.util.Objects;

public class Vet {
    private String  id;
   private String  firstName;
    private String lastName;
    private List<Speciality> specialties;

    public Vet() {}

    public Vet(List<Speciality> specialties) {
        this.specialties = specialties;
    }

    public Vet(String id, String firstName, String lastName, List<Speciality> specialties) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialties = specialties;
    }

    public Vet(String id) {
        this.id= id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Speciality> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(List<Speciality> specialties) {
        this.specialties = specialties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vet)) return false;
        Vet vet = (Vet) o;
        return Objects.equals(getId(), vet.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
