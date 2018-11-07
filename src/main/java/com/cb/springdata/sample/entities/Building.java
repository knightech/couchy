package com.cb.springdata.sample.entities;


import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Document
public class Building {

    @Id
    private String id;

    @NotNull
    private String name;

    @NotNull
    private String companyId;

    private List<Area> areas = new ArrayList<>();

    private List<String> phoneNumbers = new ArrayList<>();


    public Building() {
    }

    public Building(String id, String name, String companyId, List<Area> areas, List<String> phoneNumbers) {
        this.id = id;
        this.name = name;
        this.companyId = companyId;
        this.areas = areas;
        this.phoneNumbers = phoneNumbers;
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

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public List<Area> getAreas() {
        return areas;
    }

    public void setAreas(List<Area> areas) {
        this.areas = areas;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return Objects.equals(id, building.id) &&
                Objects.equals(name, building.name) &&
                Objects.equals(companyId, building.companyId) &&
                Objects.equals(areas, building.areas) &&
                Objects.equals(phoneNumbers, building.phoneNumbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, companyId, areas, phoneNumbers);
    }
}
