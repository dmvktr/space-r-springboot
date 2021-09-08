package com.codecool.dao.implementation;

import com.codecool.dao.NewsDao;
import com.codecool.model.news.News;
import com.codecool.service.APIDataHandler;
import com.codecool.service.apiAccessRoutes.APIAccessRoutes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("newsDao")
public class NewsDaoMem implements NewsDao {
    private final APIDataHandler apiDataHandler;

    @Autowired
    public NewsDaoMem(APIDataHandler apiDataHandler) {
        this.apiDataHandler = apiDataHandler;
    }

    @Override
    public News getBy(int id) {
        return null;
    }

    @Override
    public News[] getAllNews() {
        return apiDataHandler.fetchData(APIAccessRoutes.NEWS, News[].class);
    }

    @Override
    public void updateNews(List<News> news) { }
}
