package com.utn.newsAPI.model;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Video extends News{

    String videoURL;

    @Override
    public TypeNews typeNews() {
        return TypeNews.TEXT;
    }

}
