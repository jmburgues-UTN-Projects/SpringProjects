package com.utn.restTest.service;

import com.utn.restTest.model.News;
import com.utn.restTest.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NewsService {
    @Autowired
    NewsRepository newsRepository;

    public News getById(Integer newsId){
        return this.newsRepository.findById(newsId)
                .orElse(new News());
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

}
