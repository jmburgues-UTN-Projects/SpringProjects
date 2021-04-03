package com.utn.newsAPI.model;

public class Video extends News{

    String videoURL;

    @Override
    public TypeNews typeNews() {
        return TypeNews.TEXT;
    }

}
