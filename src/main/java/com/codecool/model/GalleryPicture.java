package com.codecool.model;


public class GalleryPicture {
    private String hdUrl;
    private String url;
    private String title;

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

    @Override
    public String toString() {
        return "GalleryPicture{" +
            "hdUrl='" + hdUrl + '\'' +
            ", url='" + url + '\'' +
            ", title='" + title + '\'' +
            '}';
    }
}
