package com.utn.newsAPI.model;

public enum TypeNews {
    TEXT("Text"),
    IMAGE("Text and Image"),
    VIDEO("Text, image and Video");

    private String description;

    TypeNews(String description){
        this.description = description;
    }

    public static TypeNews find(String description){
        for (TypeNews n : values()){
            if(values().toString().equalsIgnoreCase(description)){
                return n;
            }
        }
        throw new IllegalArgumentException(String.format("Invalid type of news: %s", description));
    }

    public String getDescription(){
        return this.description;
    }
}
