package com.codecool.dao;

import com.codecool.model.Article;
import com.codecool.model.GalleryPicture;

import java.util.List;


public interface GalleryDao {
    List<Article> getAllPictures();

    GalleryPicture getBy(int id);
}
