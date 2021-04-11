package com.utn.newsAPI.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
public class Image extends News{
    String imageURL;

    @Override
    public TypeNews typeNews() {
        return TypeNews.TEXT;
    }
}
