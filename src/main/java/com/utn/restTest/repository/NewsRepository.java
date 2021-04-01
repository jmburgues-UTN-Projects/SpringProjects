package com.utn.restTest.repository;

import com.utn.restTest.model.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends JpaRepository<News,Integer> {
}
