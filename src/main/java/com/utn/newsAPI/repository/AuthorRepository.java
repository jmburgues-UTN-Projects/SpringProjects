package com.utn.newsAPI.repository;

import com.utn.newsAPI.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, String> {
}
