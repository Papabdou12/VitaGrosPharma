package com.saraya.model;

import java.util.Objects;

public class Speciality {
    private String id;
    private String name;

    public Speciality()     {
    }
    public Speciality( String id ,String name) {
        this.id = id;
        this.name = name;
    }
    public Speciality( String id ) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Speciality)) return false;
        Speciality that = (Speciality) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
