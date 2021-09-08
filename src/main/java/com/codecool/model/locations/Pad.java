package com.codecool.model.locations;

public class Pad {
    private String name;
    private String wiki_url;
    private String latitude;
    private String longitude;
    private String total_launch_count;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWiki_url() {
        return wiki_url;
    }

    public void setWiki_url(String wiki_url) {
        this.wiki_url = wiki_url;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getTotal_launch_count() {
        return total_launch_count;
    }

    public void setTotal_launch_count(String total_launch_count) {
        this.total_launch_count = total_launch_count;
    }
}
