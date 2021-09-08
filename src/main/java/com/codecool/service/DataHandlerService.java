package com.codecool.service;

import com.codecool.dao.ArticleDao;
import com.codecool.dao.AstronautDao;
import com.codecool.dao.EventDao;

import org.springframework.stereotype.Component;

@Component
public class DataHandlerService {
    private ArticleDao articleDao;
    private AstronautDao astronautDao;
    private EventDao eventDao;

    public DataHandlerService(ArticleDao articleDao, AstronautDao astronautDao, EventDao eventDao) {
        this.articleDao = articleDao;
        this.astronautDao = astronautDao;
        this.eventDao = eventDao;
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

    public EventDao getEventDao() {
        return eventDao;
    }

    public void setEventDao(EventDao eventDao) {
        this.eventDao = eventDao;
    }
}
