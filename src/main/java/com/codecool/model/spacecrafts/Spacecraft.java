package com.codecool.model.spacecrafts;

public class Spacecraft {
    private String id;
    private String name;
    private String in_use;
    private String crew_capacity;
    private String image_url;
    private String capability;
    private Agency agency;
    private String human_rated;

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

    public String getIn_use() {
        return in_use;
    }

    public void setIn_use(String in_use) {
        this.in_use = in_use;
    }

    public String getCrew_capacity() {
        return crew_capacity;
    }

    public void setCrew_capacity(String crew_capacity) {
        this.crew_capacity = crew_capacity;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getCapability() {
        return capability;
    }

    public void setCapability(String capability) {
        this.capability = capability;
    }

    public Agency getAgency() {
        return agency;
    }

    public void setAgency(Agency agency) {
        this.agency = agency;
    }

    public String getHuman_rated() {
        return human_rated;
    }

    public void setHuman_rated(String human_rated) {
        this.human_rated = human_rated;
    }
}
