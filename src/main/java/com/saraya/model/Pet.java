package com.saraya.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Pet{
    private String id;
    private String name;
    private LocalDate dateOfBirth;
    private List<PetType> petType;
    private List<Visit> visits;

    public Pet() {
    }

    public Pet(String id) {
        this.id = id;
    }

    public Pet(String id, String name, LocalDate dateOfBirth, List<PetType> petType, List<Visit> visits) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.petType = petType;
        this.visits = visits;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<PetType> getPetType() {
        return petType;
    }

    public void setPetType(List<PetType> petType) {
        this.petType = petType;
    }

    public List<Visit> getVisits() {
        return visits;
    }

    public void setVisits(List<Visit> visits) {
        this.visits = visits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return getId() == pet.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
