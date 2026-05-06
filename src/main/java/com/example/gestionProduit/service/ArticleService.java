package com.example.gestionProduit.service;
import com.example.gestionProduit.entity.Article;
import com.example.gestionProduit.repository.ArticleRepository;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ArticleService {
    private final ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }
    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }
    public Article saveArticle(Article article) {
        return articleRepository.save(article);
    }

}
