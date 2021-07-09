package com.example.repository;

import com.example.Entity.Article;

import org.springframework.data.repository.CrudRepository;

public interface articleRepository extends CrudRepository<Article, Long>{
    
}
