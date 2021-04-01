package com.utn.restTest.controller;

import com.utn.restTest.model.News;
import com.utn.restTest.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    NewsService newsService;

    @GetMapping
    public List<News> getAll(){
        return this.newsService.getAll();
    }

    @GetMapping("/{id}")
    public News getOne(@PathVariable Integer id){
        return this.newsService.getById(id);
    }

    @PostMapping
    public void addNews(@RequestBody News oneNews){
        this.newsService.add(oneNews);
    }

}
