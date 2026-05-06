package com.example.gestionProduit.controller;
import com.example.gestionProduit.entity.Article;
import com.example.gestionProduit.service.ArticleService;

import java.util.List;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/articles")
public class ArticleController {
    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping
    public List<Article> getAllArticles() {
        return articleService.getAllArticles();
    }

    @PostMapping
    public Article createArticle(@RequestBody Article article) {
        return articleService.saveArticle(article);
    }

}
