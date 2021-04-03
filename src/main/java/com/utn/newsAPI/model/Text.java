package com.utn.newsAPI.model;

public class Text extends News{

    private String body;

    @Override
    public TypeNews typeNews() {
        return TypeNews.TEXT;
    }
}
