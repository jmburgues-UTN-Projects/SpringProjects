package com.utn.newsAPI.model;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Text extends News{

    private String body;

    @Override
    public TypeNews typeNews() {
        return TypeNews.TEXT;
    }
}
