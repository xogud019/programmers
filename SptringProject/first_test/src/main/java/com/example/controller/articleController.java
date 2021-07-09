package com.example.controller;

import com.example.Entity.Article;
import com.example.dto.articleForm;
import com.example.repository.articleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class articleController {
    @Autowired
    private articleRepository artRe;
    
    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(articleForm form){
        //System.out.println(form.toString());
        log.info(form.toString());
        //1. dto -> entity
        Article article = form.toEntity();
        log.info(article.toString());
        //System.out.println(article.toString());

        //2. repository -> db
        Article saved = artRe.save(article);
        log.info(saved.toString());
        //System.out.println(saved.toString());

        return "";
    }
}
