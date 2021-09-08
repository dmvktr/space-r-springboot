package com.codecool.dao;

import com.codecool.model.GalleryPicture;
import com.codecool.service.APIDataHandler;
import com.codecool.service.apiAccessRoutes.APIAccessRoutes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("galleryDao")
public class GalleryDaoMem implements GalleryDao{
    private final APIDataHandler apiDataHandler;

    @Autowired
    public GalleryDaoMem(APIDataHandler apiDataHandler) {
        this.apiDataHandler = apiDataHandler;
    }

    @Override
    public GalleryPicture[] getAllPictures() {
        return apiDataHandler.fetchData(APIAccessRoutes.GALLERY, GalleryPicture[].class);
    }

    @Override
    public GalleryPicture getBy(int id) {
        return null;
    }
}
