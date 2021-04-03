package com.utn.newsAPI.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class Video extends News{

    String videoURL;

    @Override
    public TypeNews typeNews() {
        return TypeNews.TEXT;
    }

}
