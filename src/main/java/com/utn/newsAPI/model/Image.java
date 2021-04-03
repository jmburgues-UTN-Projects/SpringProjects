package com.utn.newsAPI.model;

import java.awt.image.BufferedImage;

public class Image extends News{

    String imageURL;

    @Override
    public TypeNews typeNews() {
        return TypeNews.TEXT;
    }
}
