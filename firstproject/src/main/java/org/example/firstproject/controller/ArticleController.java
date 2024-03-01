package org.example.firstproject.controller;

import org.example.firstproject.dto.ArticleForm;
import org.example.firstproject.entity.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {
    @GetMapping("/articles/news")
    public String newsArticleForm() {
        return "articles/news";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form) {
        System.out.println(form.toString());
        // 1. DTO를 엔티티로 변환한다.
        Article article = form.toEntity();
        // 2. 레포지토리로 엔티티를 DB에 저장한다.
        return "";
    }
}
