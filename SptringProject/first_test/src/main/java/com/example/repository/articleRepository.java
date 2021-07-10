package com.example.repository;

import com.example.Entity.Article;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface articleRepository extends CrudRepository<Article, Long>{
    
}
