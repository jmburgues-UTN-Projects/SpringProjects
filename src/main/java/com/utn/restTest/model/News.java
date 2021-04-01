package com.utn.restTest.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@RequiredArgsConstructor
@Setter
@Getter
@Entity
public class News {
    @Id
    public Integer newsId;
    public String title;
    public String description;
}
