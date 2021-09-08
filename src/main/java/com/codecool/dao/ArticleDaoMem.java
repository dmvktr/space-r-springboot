package com.codecool.dao;

import com.codecool.model.Article;
import com.codecool.service.APIDataHandler;
import com.codecool.service.apiAccessRoutes.APIAccessRoutes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("articleDao")
public class ArticleDaoMem implements ArticleDao{
    private final APIDataHandler apiDataHandler;

    @Autowired
    public ArticleDaoMem(APIDataHandler apiDataHandler) {
        this.apiDataHandler = apiDataHandler;
    }

    @Override
    public Article getBy(int id) {
        return null;
    }

    @Override
    public Article[] getAllArticles() {
        return apiDataHandler.fetchData(APIAccessRoutes.NEWS, Article[].class);
    }

    @Override
    public void updateNews(List<Article> articles) { }
}
