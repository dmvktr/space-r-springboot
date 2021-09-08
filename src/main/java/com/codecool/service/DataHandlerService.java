package com.codecool.service;

import com.codecool.dao.ArticleDao;
import com.codecool.dao.AstronautDao;

import com.codecool.dao.SpacecraftDao;
import org.springframework.stereotype.Component;

@Component
public class DataHandlerService {
    private ArticleDao articleDao;
    private AstronautDao astronautDao;
    private SpacecraftDao spacecraftDao;

    public DataHandlerService(ArticleDao articleDao, AstronautDao astronautDao, SpacecraftDao spacecraftDao) {
        this.articleDao = articleDao;
        this.astronautDao = astronautDao;
        this.spacecraftDao = spacecraftDao;

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
}
