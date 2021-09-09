package com.codecool.service;

import com.codecool.dao.*;
import com.codecool.model.news.News;
import com.codecool.model.gallery.GalleryPicture;
import com.codecool.model.astronauts.Astronauts;
import com.codecool.model.events.Events;
import com.codecool.model.locations.Locations;
import com.codecool.model.spacecrafts.Spacecrafts;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class DataHandlerServiceTests {
    NewsDao newsDao;
    AstronautDao astronautDao;
    GalleryDao galleryDao;
    SpacecraftDao spacecraftDao;
    LocationsDao locationsDao;
    EventDao eventDao;

    @BeforeEach
    void setup(){
        newsDao = Mockito.mock(NewsDao.class);
        astronautDao = Mockito.mock(AstronautDao.class);
        galleryDao = Mockito.mock(GalleryDao.class);
        spacecraftDao = Mockito.mock(SpacecraftDao.class);
        locationsDao = Mockito.mock(LocationsDao.class);
        eventDao = Mockito.mock(EventDao.class);
    }

    @Test
    void newsRoute_shouldReturnNewsArray_whenUserVisitsRoute() {
        News firstNewsArticle = new News(1,"articleTitle", "dummyUrl", "newsSite", "articleUrl", "url", "summaryOfArticle", "publishedAt");
        News secondNewsArticle = new News(2,"articleTitle2", "dummyUrl2", "newsSite2", "articleUrl", "url", "summaryOfArticle", "publishedAt");
        News[] news = {firstNewsArticle, secondNewsArticle};

        Mockito.when(newsDao.getAllNews()).thenReturn(news);
        assertEquals(firstNewsArticle, newsDao.getAllNews()[0]);
        assertEquals(secondNewsArticle, newsDao.getAllNews()[1]);
    }

    @Test
    void astronautsRoute_shouldReturnAstronautsObject_whenUserVisitsRoute() {
        Astronauts astronauts = new Astronauts();

        Mockito.when(astronautDao.getAllAstronauts()).thenReturn(astronauts);
        assertEquals(astronauts, astronautDao.getAllAstronauts());
    }

    @Test
    void galleryRoute_shouldReturnPicturesArray_whenUserVisitsRoute() {
        GalleryPicture picture1 = new GalleryPicture();
        GalleryPicture picture2 = new GalleryPicture();
        GalleryPicture picture3 = new GalleryPicture();
        GalleryPicture[] gallery = {picture1, picture2, picture3};

        Mockito.when(galleryDao.getAllPictures()).thenReturn(gallery);
        assertEquals(picture1, galleryDao.getAllPictures()[0]);
        assertEquals(picture2, galleryDao.getAllPictures()[1]);
        assertEquals(picture3, galleryDao.getAllPictures()[2]);
    }

    @Test
    void spacecraftsRoute_shouldReturnSpacecraftsObject_whenUserVisitsRoute() {
        Spacecrafts spacecrafts = new Spacecrafts();
        Mockito.when(spacecraftDao.getAllSpacecrafts()).thenReturn(spacecrafts);
        assertEquals(spacecrafts, spacecraftDao.getAllSpacecrafts());
    }

    @Test
    void locationsRoute_shouldReturnLocationsObject_whenUserVisitsRoute() {
        Locations locations = new Locations();
        Mockito.when(locationsDao.getAllLocations()).thenReturn(locations);
        assertEquals(locations, locationsDao.getAllLocations());
    }

    @Test
    void eventsRoute_shouldReturnEventsObject_whenUserVisitsRoute() {
        Events events = new Events();
        Mockito.when(eventDao.getAllEvents()).thenReturn(events);
        assertEquals(events, eventDao.getAllEvents());
    }
}