package com.codecool.controller;

import com.codecool.model.news.News;
import com.codecool.model.gallery.GalleryPicture;
import com.codecool.model.astronauts.Astronauts;
import com.codecool.model.events.Events;
import com.codecool.model.locations.Locations;
import com.codecool.model.spacecrafts.Spacecrafts;
import com.codecool.service.DataHandlerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class RestControllerUnitTests {
    DataHandlerService dataHandlerService;

    @BeforeEach
    void setup(){
        dataHandlerService = Mockito.mock(DataHandlerService.class);
    }

    @Test
    void newsRoute_shouldReturnArticles_whenUserVisitsRoute() {
        News firstNewsArticle = new News("articleTitle", "dummyUrl", "newsSite", "articleUrl", "url", "summaryOfArticle", "publishedAt");
        News secondNewsArticle = new News("articleTitle2", "dummyUrl2", "newsSite2", "articleUrl", "url", "summaryOfArticle", "publishedAt");
        News[] news = {firstNewsArticle, secondNewsArticle};

        Mockito.when(dataHandlerService.getAllArticles()).thenReturn(news);
        assertEquals(firstNewsArticle, dataHandlerService.getAllArticles()[0]);
        assertEquals(secondNewsArticle, dataHandlerService.getAllArticles()[1]);
    }

    @Test
    void astronautsRoute_shouldReturnAstronautsObject_whenUserVisitsRoute() {
        Astronauts astronauts = new Astronauts();

        Mockito.when(dataHandlerService.getAllAstronauts()).thenReturn(astronauts);
        assertEquals(astronauts, dataHandlerService.getAllAstronauts());
    }

    @Test
    void galleryRoute_shouldReturnPicturesArray_whenUserVisitsRoute() {
        GalleryPicture picture1 = new GalleryPicture();
        GalleryPicture picture2 = new GalleryPicture();
        GalleryPicture picture3 = new GalleryPicture();
        GalleryPicture[] gallery = {picture1, picture2, picture3};

        Mockito.when(dataHandlerService.getAllPictures()).thenReturn(gallery);
        assertEquals(picture1, dataHandlerService.getAllPictures()[0]);
        assertEquals(picture2, dataHandlerService.getAllPictures()[1]);
        assertEquals(picture3, dataHandlerService.getAllPictures()[2]);
    }

    @Test
    void spacecraftsRoute_shouldReturnSpacecraftsObject_whenUserVisitsRoute() {
        Spacecrafts spacecrafts = new Spacecrafts();
        Mockito.when(dataHandlerService.getAllSpacecrafts()).thenReturn(spacecrafts);
        assertEquals(spacecrafts, dataHandlerService.getAllSpacecrafts());
    }

    @Test
    void locations() {
        Locations locations = new Locations();
        Mockito.when(dataHandlerService.getAllLocations()).thenReturn(locations);
        assertEquals(locations, dataHandlerService.getAllLocations());
    }

    @Test
    void events() {
        Events events = new Events();
        Mockito.when(dataHandlerService.getAllEvents()).thenReturn(events);
        assertEquals(events, dataHandlerService.getAllEvents());
    }
}