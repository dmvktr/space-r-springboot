package com.codecool.dao.implementation;

import com.codecool.dao.ArticleDao;
import com.codecool.model.news.News;
import com.codecool.service.APIDataHandler;
import com.codecool.service.apiAccessRoutes.APIAccessRoutes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("articleDao")
public class ArticleDaoMem implements ArticleDao {
    private final APIDataHandler apiDataHandler;

    @Autowired
    public ArticleDaoMem(APIDataHandler apiDataHandler) {
        this.apiDataHandler = apiDataHandler;
    }

    @Override
    public News getBy(int id) {
        return null;
    }

    @Override
    public News[] getAllArticles() {
        return apiDataHandler.fetchData(APIAccessRoutes.NEWS, News[].class);
    }

    @Override
    public void updateNews(List<News> news) { }
}
