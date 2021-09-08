package com.codecool.model.locations;

import java.util.List;

public class Pads {
    private String id;
    private String name;
    private String country_code;
    private List<Pad> pads;

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

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public List<Pad> getPads() {
        return pads;
    }

    public void setPads(List<Pad> pads) {
        this.pads = pads;
    }
}
