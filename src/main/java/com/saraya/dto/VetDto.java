package com.saraya.dto;

import com.saraya.model.Speciality;

import java.util.List;

public class VetDto {
    private String id;
    private String  firstName;
    private String lastName;
    private List<Speciality> specialties;

    public VetDto() {
    }

    public VetDto(String id, String firstName, String lastName, List<Speciality> specialties) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialties = specialties;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    public String toString() {
        return "VetDto{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", specialties=" + specialties +
                '}';
    }
}
