package com.codecool.dao;

import com.codecool.model.Article;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("articleDao")
public class ArticleDaoMem implements ArticleDao{
    private List<Article> news;


    @Override
    public Article getBy(int id) {
        return null;
    }

    @Override
    public List<Article> getAllArticles() {
        return null;
    }

    @Override
    public void updateNews(List<Article> articles) { }
}
