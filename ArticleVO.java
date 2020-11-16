package com.example.myapplication;

public class ArticleVO {
    private int articleVO;
    private String subject;
    private String description;
    private String author;

    public ArticleVO(int articleVO, String subject, String description, String author) {
        this.articleVO = articleVO;
        this.subject = subject;
        this.description = description;
        this.author = author;
    }

    public void setArticleVO(int articleNO) {
        this.articleVO = articleNO;
    }

    public int getArticleVO() {
        return articleVO;
    }

    public ArticleVO(String subject) {
        this.subject = subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
