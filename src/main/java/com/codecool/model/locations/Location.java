package com.codecool.model.locations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {
    private String id;
    private String name;
    @JsonProperty("map_image")
    private String mapImage;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("total_launch_count")
    private String totalLaunchCount;
    @JsonProperty("total_landing_count")
    private String totalLandingCount;
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

    public String getMapImage() {
        return mapImage;
    }

    public void setMapImage(String mapImage) {
        this.mapImage = mapImage;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getTotalLaunchCount() {
        return totalLaunchCount;
    }

    public void setTotalLaunchCount(String totalLaunchCount) {
        this.totalLaunchCount = totalLaunchCount;
    }

    public String getTotalLandingCount() {
        return totalLandingCount;
    }

    public void setTotalLandingCount(String totalLandingCount) {
        this.totalLandingCount = totalLandingCount;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

