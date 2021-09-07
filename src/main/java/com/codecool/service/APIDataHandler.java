package com.codecool.service;

import com.codecool.model.Article;
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

}
