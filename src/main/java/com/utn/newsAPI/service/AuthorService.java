package com.utn.newsAPI.service;

import com.utn.newsAPI.model.Author;
import com.utn.newsAPI.model.News;
import com.utn.newsAPI.repository.AuthorRepository;
import com.utn.newsAPI.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@Service
public class AuthorService {

    AuthorRepository authorRepo;
    NewsRepository newsRepo;

    @Autowired
    public AuthorService(AuthorRepository authorRepo, NewsRepository newsRepo) {
        this.authorRepo = authorRepo;
        this.newsRepo = newsRepo;
    }

    public List<Author> getAll(){
        return this.authorRepo.findAll();
    }

    public Author getById(String id){
        return this.authorRepo.findById(id)
                .orElseThrow(() -> new HttpClientErrorException(HttpStatus.NOT_FOUND));
    }

    public void add(Author a){
        this.authorRepo.save(a);
    }

    public void delete(String id){
        this.authorRepo.deleteById(id);
    }

    public void addNewsToAuthor(String authorId, Integer newsId){
        Author a = this.getById(authorId);
        a.getWrittenNews().add(this.newsRepo.getOne(newsId));
        this.add(a);
    }
}
