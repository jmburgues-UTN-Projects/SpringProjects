package com.utn.newsAPI.controller;

import com.utn.newsAPI.model.News;
import com.utn.newsAPI.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // indicates Spring this class is a Controller
@RequestMapping("/news") //indicates the URL endpoint
public class NewsController {

    @Autowired // dependency injection, Spring will instantiate the attribute when needed.
    NewsService newsService;

    @GetMapping // maps the endpoint with this specific method.
    public List<News> getAll(){
        return this.newsService.getAll();
    }

    @GetMapping("/{id}") // maps the endpoint with this specific method where {id} is a variable
    public News getOne(@PathVariable Integer id){ // PathVaraible maps the variable specified with the endpoint's variable
        return this.newsService.getById(id);
    }

    @PostMapping
    public void addNews(@RequestBody News oneNews){ // RequestBody maps the incoming JSON with the respective Object
        this.newsService.add(oneNews);
    }

}
