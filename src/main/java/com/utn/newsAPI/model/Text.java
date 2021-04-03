package com.utn.newsAPI.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class Text extends News{

    private String body;

    @Override
    public TypeNews typeNews() {
        return TypeNews.TEXT;
    }
}
