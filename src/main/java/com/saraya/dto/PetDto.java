package com.saraya.dto;

import java.time.LocalDate;
import java.util.List;

public class PetDto {
    private String id;
    private String name;
    private LocalDate dateOfBirth;
    private List<String> petType;
    private List<String>  visits;

    public PetDto() {
    }

    public PetDto(String id) {
        this.id = id;
    }

    public PetDto(String id, String name, LocalDate dateOfBirth, List<String> petType, List<String> visits) {
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

    public List<String> getPetType() {
        return petType;
    }

    public void setPetType(List<String> petType) {
        this.petType = petType;
    }

    public List<String> getVisits() {
        return visits;
    }

    public void setVisits(List<String> visits) {
        this.visits = visits;
    }

    @Override
    public String toString() {
        return "PetDto{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", petType=" + petType +
                ", visits=" + visits +
                '}';
    }
}
