package com.utn.restTest.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

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
