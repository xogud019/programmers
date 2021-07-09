package com.example.dto;

import com.example.Entity.Article;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class articleForm {
    private String title;
    private String content;
    
    /*
    public articleForm(String title, String content){
        this.title = title;
        this.content = content;
    }
    */
    /*
    @Override
    public String toString(){
        return "articleForm{"+"title='"+title+ ", content='"+ content  + '}';
    }
    */
    public Article toEntity() {
        return new Article(null,title,content);
    }
}
