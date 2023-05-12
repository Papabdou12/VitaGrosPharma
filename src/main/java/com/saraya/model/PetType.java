package com.saraya.model;

import java.util.Objects;

public class PetType {
    private String id;
    private String name;
    public PetType(){}

    public PetType(String id) {
        this.id = id;
    }

    public PetType(String id, String name) {
        this.id = id;
        this.name = name;
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
        if (!(o instanceof PetType)) return false;
        PetType petType = (PetType) o;
        return id.equals(petType.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
