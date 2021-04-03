package com.utn.newsAPI.service;

import com.utn.newsAPI.model.News;
import com.utn.newsAPI.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;
import java.util.MissingFormatArgumentException;

@Service
public class NewsService {
    @Autowired
    NewsRepository newsRepository;

    public News getById(Integer newsId){
        return this.newsRepository.findById(newsId)
                .orElseThrow(() -> new HttpClientErrorException(HttpStatus.NOT_FOUND));
    }

    public List<News> getAll(){
        return this.newsRepository.findAll();
    }

    public void add(News n){
        this.newsRepository.save(n);
    }

    public void modify(News n){
        /** implementar **/

    }

//    public List<News> getAll_ByAuthorId(String id) {
//        this.newsRepository.findAllById()
//
//    }
}
