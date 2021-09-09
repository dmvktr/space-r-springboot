package com.codecool.model.news;


import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class News {
    private String title;
    private String imageUrl;
    private String newsSite;
    private String articleUrl;
    private String url;
    private String summary;
    private String publishedAt;

    public News() {
    }

    public News(String title, String imageUrl, String newsSite, String articleUrl, String url, String summary, String publishedAt) {
        this.title = title;
        this.imageUrl = imageUrl;
        this.newsSite = newsSite;
        this.articleUrl = articleUrl;
        this.url = url;
        this.summary = summary;
        this.publishedAt = publishedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return Objects.equals(getTitle(), news.getTitle()) && Objects.equals(getImageUrl(), news.getImageUrl()) && Objects.equals(getNewsSite(), news.getNewsSite()) && Objects.equals(getArticleUrl(), news.getArticleUrl()) && Objects.equals(getUrl(), news.getUrl()) && Objects.equals(getSummary(), news.getSummary()) && Objects.equals(getPublishedAt(), news.getPublishedAt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getImageUrl(), getNewsSite(), getArticleUrl(), getUrl(), getSummary(), getPublishedAt());
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getNewsSite() {
        return newsSite;
    }

    public void setNewsSite(String newsSite) {
        this.newsSite = newsSite;
    }

    public String getArticleUrl() {
        return articleUrl;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl;
    }

    public String getSummary() {
        return summary;
    }

    public void setArticleSummary(String summary) {
        this.summary = summary;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }
}
