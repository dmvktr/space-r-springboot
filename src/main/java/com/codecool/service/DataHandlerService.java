package com.codecool.service;

import com.codecool.dao.ArticleDao;
import com.codecool.dao.AstronautDao;
import org.springframework.stereotype.Component;

@Component
public class DataHandlerService {
    private ArticleDao articleDao;
    private AstronautDao astronautDao;

    public DataHandlerService(ArticleDao articleDao, AstronautDao astronautDao) {
        this.articleDao = articleDao;
        this.astronautDao = astronautDao;
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
}
