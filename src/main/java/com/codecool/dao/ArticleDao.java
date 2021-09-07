package com.codecool.dao;

import com.codecool.model.Article;

import java.util.List;

public interface ArticleDao {
    Article getBy(int id);
    List<Article> getAllArticles();
    void updateNews(List<Article> articles);
}
