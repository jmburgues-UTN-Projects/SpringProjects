package com.utn.newsAPI.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Author {
    @Id
    private String userName;
    private String fullName;
    private String password;

    //private List<News> writtenNews;
}
