package com.utn.newsAPI.controller;

import com.utn.newsAPI.model.Author;
import com.utn.newsAPI.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @GetMapping
    public List<Author> getAll(){
        return this.authorService.getAll();
    }

    @GetMapping("/{id}")
    public Author getOne(@PathVariable String id){
        return this.authorService.getById(id);
    }

    @PostMapping
    public void add(@RequestBody Author a){
        this.authorService.add(a);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        this.authorService.delete(id);
    }


}
