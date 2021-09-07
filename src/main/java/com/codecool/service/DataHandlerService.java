package com.codecool.service;

import com.codecool.dao.ArticleDao;
import org.springframework.stereotype.Component;

@Component
public class DataHandlerService {
    private ArticleDao articleDao;

    public DataHandlerService(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }

    public ArticleDao getArticleDao() {
        return articleDao;
    }

    public void setArticleDao(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }
}
