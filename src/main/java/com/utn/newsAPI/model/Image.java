package com.utn.newsAPI.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.awt.image.BufferedImage;

@Entity
@Data
@NoArgsConstructor
public class Image extends News{
    String imageURL;

    @Override
    public TypeNews typeNews() {
        return TypeNews.TEXT;
    }
}
