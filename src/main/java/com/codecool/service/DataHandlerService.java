package com.codecool.service;

import com.codecool.dao.ArticleDao;
import com.codecool.dao.AstronautDao;

import com.codecool.dao.GalleryDao;
import com.codecool.model.Article;
import com.codecool.model.GalleryPicture;
import com.codecool.model.astronauts.Astronaut;
import com.codecool.model.astronauts.Astronauts;
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

    @Autowired
    public DataHandlerService(@Qualifier("articleDao") ArticleDao articleDao, @Qualifier("astronautDao") AstronautDao astronautDao,
                              @Qualifier("galleryDao") GalleryDao galleryDao, APIDataHandler apiDataHandler) {
        this.articleDao = articleDao;
        this.astronautDao = astronautDao;
        this.galleryDao = galleryDao;
        this.webClient = WebClient.create();
        this.apiDataHandler = apiDataHandler;
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

}
