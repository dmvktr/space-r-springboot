package com.codecool.model;

import java.io.Serializable;

public class GalleryPicture implements Serializable {
    private String hdUrl;
    private String url;
    private String title;

    public GalleryPicture(String hdUrl, String url, String title) {
        this.hdUrl = hdUrl;
        this.url = url;
        this.title = title;
    }

    public String getHdUrl() {
        return hdUrl;
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    public void setHdUrl(String hdUrl) {
        this.hdUrl = hdUrl;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
