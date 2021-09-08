package com.codecool.service;

import com.codecool.model.Article;
import com.codecool.model.locations.Locations;
import com.codecool.model.spacecrafts.Spacecrafts;
import com.codecool.model.astronauts.Astronauts;

import com.codecool.service.apiAccessRoutes.APIAccessRoutes;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Component
public class APIDataHandler {

    public List<Article> fetchData(APIAccessRoutes api) {
        RestTemplate restTemplate = new RestTemplate();
        return Arrays.asList(Objects.requireNonNull(restTemplate
            .getForObject(api.getApiPath(), Article[].class)));
    }

    public Astronauts fetchAstronautsData(APIAccessRoutes api) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate
            .getForObject(api.getApiPath(), Astronauts.class);
    }

    public Spacecrafts fetchSpacecrafts(APIAccessRoutes api) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate
                .getForObject(api.getApiPath(), Spacecrafts.class);
    }

    public Locations fetchLocations(APIAccessRoutes api) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate
                .getForObject(api.getApiPath(), Locations.class);
    }
}
