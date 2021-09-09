package com.codecool.dao;

import com.codecool.model.news.News;

import java.util.List;

public interface NewsDao {
    News getBy(int id);
    News[] getAllNews();
    void updateNews(List<News> news);
}
