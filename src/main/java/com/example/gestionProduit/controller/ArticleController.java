package com.example.gestionProduit.controller;
import com.example.gestionProduit.entity.Article;
import com.example.gestionProduit.service.ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class ArticleController {
    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }
    @GetMapping("/articles")
    public String getAllArticles(Model model) {
        model.addAttribute("articles", articleService.getAllArticles());
        return "articles";
    }

    @GetMapping("/articles/new")
    public String showCreateArticleForm(Model model) {
        model.addAttribute("article", new Article());
        return "add-article";
    }

    @PostMapping("/articles/save")
    public String saveArticle(Article article) {
        articleService.saveArticle(article);
        return "redirect:/articles";
    }

}
