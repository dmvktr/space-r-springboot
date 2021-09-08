package com.codecool.service;

import com.codecool.dao.ArticleDao;
import com.codecool.dao.AstronautDao;

import com.codecool.dao.LocationsDao;
import com.codecool.dao.SpacecraftDao;
import org.springframework.stereotype.Component;

@Component
public class DataHandlerService {
    private ArticleDao articleDao;
    private AstronautDao astronautDao;
    private SpacecraftDao spacecraftDao;
    private LocationsDao locationsDao;

    public DataHandlerService(ArticleDao articleDao,
                              AstronautDao astronautDao,
                              SpacecraftDao spacecraftDao,
                              LocationsDao locationsDao) {
        this.articleDao = articleDao;
        this.astronautDao = astronautDao;
        this.spacecraftDao = spacecraftDao;
        this.locationsDao = locationsDao;

    }

    public ArticleDao getArticleDao() {
        return articleDao;
    }

    public void setArticleDao(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }

    public AstronautDao getAstronautDao() {
        return astronautDao;
    }

    public void setAstronautDao(AstronautDao astronautDao) {
        this.astronautDao = astronautDao;
    }

    public void setSpacecraftDao(SpacecraftDao spacecraftDao) {
        this.spacecraftDao = spacecraftDao;
    }

    public SpacecraftDao getSpacecraftDao() {
        return spacecraftDao;
    }

    public LocationsDao getLocationsDao() {
        return locationsDao;
    }

    public void setLocationsDao(LocationsDao locationsDao) {
        this.locationsDao = locationsDao;
    }
}
