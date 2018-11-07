package com.cb.springdata.sample.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Area {

    private String id;

    private String name;

    private List<Area> areas = new ArrayList<>();

    public Area() {
    }

    public Area(String id, String name, List<Area> areas) {
        this.id = id;
        this.name = name;
        this.areas = areas;
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

    public List<Area> getAreas() {
        return areas;
    }

    public void setAreas(List<Area> areas) {
        this.areas = areas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Area area = (Area) o;
        return Objects.equals(id, area.id) &&
                Objects.equals(name, area.name) &&
                Objects.equals(areas, area.areas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, areas);
    }
}
