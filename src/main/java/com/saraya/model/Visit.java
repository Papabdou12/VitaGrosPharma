package com.saraya.model;

import java.time.LocalDate;
import java.util.Objects;

public class Visit {
    private String id;
   private LocalDate date ;
    private String description;

    public Visit() {
    }

    public Visit(String id) {
        this.id = id;
    }

    public Visit(String id, LocalDate date, String description) {
        this.id = id;
        this.date = date;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Visit)) return false;
        Visit visit = (Visit) o;
        return Objects.equals(getId(), visit.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
