package com.codecool.dao;

import com.codecool.model.Article;
import com.codecool.model.GalleryPicture;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("galleryDao")
public class GalleryDaoMem implements GalleryDao{
    private List<GalleryPicture> pictures;


    @Override
    public List<Article> getAllPictures() {
        return null;
    }

    @Override
    public GalleryPicture getBy(int id) {
        return null;
    }
}
