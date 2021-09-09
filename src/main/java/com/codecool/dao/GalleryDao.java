package com.codecool.dao;

import com.codecool.model.gallery.GalleryPicture;


public interface GalleryDao {
    GalleryPicture[] getAllPictures();

    GalleryPicture getBy(int id);
}
