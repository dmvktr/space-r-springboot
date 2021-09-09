package com.codecool.model.gallery;


public class GalleryPicture {
    private String hdurl;
    private String url;
    private String title;

    public String getHdurl() {
        return hdurl;
    }

    public void setHdurl(String hdurl) {
        this.hdurl = hdurl;
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
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
            "hdUrl='" + hdurl + '\'' +
            ", url='" + url + '\'' +
            ", title='" + title + '\'' +
            '}';
    }
}
