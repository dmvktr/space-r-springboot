package com.codecool.dao;

import com.codecool.model.Article;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ArticleDaoMem implements ArticleDao{
    private List<Article> news;


    @Override
    public Article getBy(int id) {
        return null;
    }

    @Override
    public List<Article> getAllArticles() {
        return this.news;
    }

    @Override
    public void updateNews(List<Article> articles) {
        this.news = articles;
    }
}
