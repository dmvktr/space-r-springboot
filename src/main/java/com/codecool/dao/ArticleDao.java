package com.codecool.dao;

import com.codecool.model.news.News;

import java.util.List;

public interface ArticleDao {
    News getBy(int id);
    News[] getAllArticles();
    void updateNews(List<News> news);
}
