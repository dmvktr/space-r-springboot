package com.codecool.service;

import com.codecool.dao.*;

import com.codecool.model.news.News;
import com.codecool.model.gallery.GalleryPicture;
import com.codecool.model.astronauts.Astronauts;
import com.codecool.model.events.Events;
import com.codecool.model.locations.Locations;
import com.codecool.model.spacecrafts.Spacecrafts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DataHandlerService {
    private final NewsDao newsDao;
    private final AstronautDao astronautDao;
    private final GalleryDao galleryDao;
    private final SpacecraftDao spacecraftDao;
    private final LocationsDao locationsDao;
    private final EventDao eventDao;

    @Autowired
    public DataHandlerService(@Qualifier("newsDao") NewsDao newsDao, @Qualifier("astronautDao") AstronautDao astronautDao,
                              @Qualifier("galleryDao") GalleryDao galleryDao, @Qualifier("spacecraftDao") SpacecraftDao spacecraftDao,
                              @Qualifier("locationsDao") LocationsDao locationsDao, @Qualifier("eventDao") EventDao eventDao) {
        this.newsDao = newsDao;
        this.astronautDao = astronautDao;
        this.galleryDao = galleryDao;
        this.spacecraftDao = spacecraftDao;
        this.locationsDao = locationsDao;
        this.eventDao = eventDao;
    }

    public Astronauts getAllAstronauts(){
        return astronautDao.getAllAstronauts();
    }

    public News[] getAllArticles(){
        return newsDao.getAllNews();
    }

    public GalleryPicture[] getAllPictures(){
        return galleryDao.getAllPictures();
    }

    public Spacecrafts getAllSpacecrafts(){
        return spacecraftDao.getAllSpacecrafts();
    }

    public Locations getAllLocations(){
        return locationsDao.getAllLocations();
    }

    public Events getAllEvents() {
        return eventDao.getAllEvents();
    }
}
