package com.codecool.service;

import com.codecool.dao.*;

import com.codecool.model.Article;
import com.codecool.model.GalleryPicture;
import com.codecool.model.astronauts.Astronauts;
import com.codecool.model.locations.Locations;
import com.codecool.model.spacecrafts.Spacecrafts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class DataHandlerService {
    private final ArticleDao articleDao;
    private final AstronautDao astronautDao;
    private final GalleryDao galleryDao;
    private final SpacecraftDao spacecraftDao;
    private final LocationsDao locationsDao;

    @Autowired
    public DataHandlerService(@Qualifier("articleDao") ArticleDao articleDao, @Qualifier("astronautDao") AstronautDao astronautDao,
                              @Qualifier("galleryDao") GalleryDao galleryDao, @Qualifier("spacecraftDao") SpacecraftDao spacecraftDao,
                              @Qualifier("locationsDao") LocationsDao locationsDao) {
        this.articleDao = articleDao;
        this.astronautDao = astronautDao;
        this.galleryDao = galleryDao;
        this.spacecraftDao = spacecraftDao;
        this.locationsDao = locationsDao;
    }

    public Astronauts getAllAstronauts(){
        return astronautDao.getAllAstronauts();
    }

    public Article[] getAllArticles(){
        return articleDao.getAllArticles();
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
}
