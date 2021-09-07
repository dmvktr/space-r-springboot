package com.codecool.dao;

import com.codecool.model.Article;

import java.util.List;

public class ArticleDaoMem implements ArticleDao{
    private List<Article> news;

    public ArticleDaoMem(List<Article> news) {
        this.news = news;
    }

    @Override
    public Article getBy(int id) {
        return null;
    }

    @Override
    public List<Article> getAll() {
        return null;
    }

    public List<Article> getNews() {
        return news;
    }
}
