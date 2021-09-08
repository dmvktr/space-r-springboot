package com.codecool.model.locations;

import java.util.List;

public class Location {
    private String id;
    private String name;
    private String map_image;
    private String country_code;
    private String total_launch_count;
    private String total_landing_count;
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMap_image() {
        return map_image;
    }

    public void setMap_image(String map_image) {
        this.map_image = map_image;
    }


    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getTotal_launch_count() {
        return total_launch_count;
    }

    public void setTotal_launch_count(String total_launch_count) {
        this.total_launch_count = total_launch_count;
    }

    public String getTotal_landing_count() {
        return total_landing_count;
    }

    public void setTotal_landing_count(String total_landing_count) {
        this.total_landing_count = total_landing_count;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
