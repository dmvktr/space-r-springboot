package com.codecool.dao;

import com.codecool.model.Article;

import java.util.List;

public interface ArticleDao {
    Article getBy(int id);
    Article[] getAllArticles();
    void updateNews(List<Article> articles);
}
