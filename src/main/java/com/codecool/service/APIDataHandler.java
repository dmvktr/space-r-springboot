package com.codecool.service;

import com.codecool.service.apiAccessRoutes.APIAccessRoutes;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class APIDataHandler {

    private final WebClient webClient;

    public APIDataHandler() {
        this.webClient = WebClient.create();
    }

    public String fetchAPIRoute(APIAccessRoutes api){
        return api.getApiPath();
    }

    public <T> T fetchData(APIAccessRoutes targetApi, Class<T> targetType){
        Mono<T> response = webClient.get()
            .uri(fetchAPIRoute(targetApi))
            .accept(MediaType.APPLICATION_JSON)
            .retrieve()
            .bodyToMono(targetType);
        return response.block();
    }
}
