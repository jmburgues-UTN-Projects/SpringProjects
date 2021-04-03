package com.utn.newsAPI.service;

import com.utn.newsAPI.model.Author;
import com.utn.newsAPI.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepo;

    public List<Author> getAll(){
        return this.authorRepo.findAll();
    }

    public Author getById(String id){
        return this.authorRepo.findById(id)
                .orElse(new Author());
    }

    public void add(Author a){
        this.authorRepo.save(a);
    }

    public void delete(String id){
        this.authorRepo.deleteById(id);
    }
}
