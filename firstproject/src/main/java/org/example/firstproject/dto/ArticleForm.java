package org.example.firstproject.dto;

import org.example.firstproject.entity.Article;

public class ArticleForm {
    private String title;
    private String content;

    /**
     * 생성자
     * @param title 제목
     * @param content 내용
     */
    public ArticleForm(String title, String content) {
        this.title = title;
        this.content = content;
    }

    /**
     * 결과를 확인하기 위한 toString
     * @return
     */
    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public Article toEntity() {
        return new Article(null, title, content);
    }
}
