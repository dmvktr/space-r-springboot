package com.codecool.service.apiAccessRoutes;

public enum APIAccessRoutes {
    NEWS ("https://api.spaceflightnewsapi.net/v3/articles?_limit=15"),
    GALLERY("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&count=25"),
    SPACECRAFTS("https://lldev.thespacedevs.com/2.2.0/config/spacecraft/"),
    ASTRONAUTS("https://lldev.thespacedevs.com/2.2.0/astronaut/?limit=2"),
    EVENTS("https://lldev.thespacedevs.com/2.2.0/event/?limit=25"),
    LOCATIONS("https://lldev.thespacedevs.com/2.0.0/location/?format=json&limit=9&");

    private String apiPath;

    APIAccessRoutes(String apiPath) {
        this.apiPath = apiPath;
    }

    public String getApiPath() {
        return apiPath;
    }
}
