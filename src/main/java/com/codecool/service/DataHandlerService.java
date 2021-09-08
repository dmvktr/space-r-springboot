package com.codecool.service;

import com.codecool.dao.*;

import com.codecool.model.Article;
import com.codecool.model.GalleryPicture;
import com.codecool.model.astronauts.Astronaut;
import com.codecool.model.astronauts.Astronauts;
import com.codecool.model.locations.Locations;
import com.codecool.model.spacecrafts.Spacecrafts;
import com.codecool.service.apiAccessRoutes.APIAccessRoutes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;
import org.springframework.web.reactive.function.client.WebClient;


@Component
public class DataHandlerService {
    private ArticleDao articleDao;
    private AstronautDao astronautDao;
    private GalleryDao galleryDao;
    private WebClient webClient;
    private APIDataHandler apiDataHandler;
    private SpacecraftDao spacecraftDao;
    private LocationsDao locationsDao;

    @Autowired
    public DataHandlerService(@Qualifier("articleDao") ArticleDao articleDao, @Qualifier("astronautDao") AstronautDao astronautDao,
                              @Qualifier("galleryDao") GalleryDao galleryDao, @Qualifier("spacecraftDao") SpacecraftDao spacecraftDao,
                              @Qualifier("locationsDao") LocationsDao locationsDao, APIDataHandler apiDataHandler) {
        this.articleDao = articleDao;
        this.astronautDao = astronautDao;
        this.galleryDao = galleryDao;
        this.webClient = WebClient.create();
        this.apiDataHandler = apiDataHandler;
        this.spacecraftDao = spacecraftDao;
        this.locationsDao = locationsDao;
    }

    public Astronauts getAllAstronauts(){
        Mono<Astronauts> response = webClient.get()
            .uri(apiDataHandler.fetchAPIRoute(APIAccessRoutes.ASTRONAUTS))
            .accept(MediaType.APPLICATION_JSON)
            .retrieve()
            .bodyToMono(Astronauts.class);
        return response.block();
    }

    public Article[] getAllArticles(){
        Mono<Article[]> response = webClient.get()
            .uri(apiDataHandler.fetchAPIRoute(APIAccessRoutes.NEWS))
            .accept(MediaType.APPLICATION_JSON)
            .retrieve()
            .bodyToMono(Article[].class);
        return response.block();
    }

    public GalleryPicture[] getAllPictures(){
        Mono<GalleryPicture[]> response = webClient.get()
            .uri(apiDataHandler.fetchAPIRoute(APIAccessRoutes.GALLERY))
            .accept(MediaType.APPLICATION_JSON)
            .retrieve()
            .bodyToMono(GalleryPicture[].class);
        return response.block();
    }

    public Spacecrafts getAllSpacecrafts(){
        Mono<Spacecrafts> response = webClient.get()
            .uri(apiDataHandler.fetchAPIRoute(APIAccessRoutes.SPACECRAFTS))
            .accept(MediaType.APPLICATION_JSON)
            .retrieve()
            .bodyToMono(Spacecrafts.class);
        return response.block();
    }

    public Locations getAllLocations(){
        Mono<Locations> response = webClient.get()
            .uri(apiDataHandler.fetchAPIRoute(APIAccessRoutes.LOCATIONS))
            .accept(MediaType.APPLICATION_JSON)
            .retrieve()
            .bodyToMono(Locations.class);
        return response.block();
    }

}
