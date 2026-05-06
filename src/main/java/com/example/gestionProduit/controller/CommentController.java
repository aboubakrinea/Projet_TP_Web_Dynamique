package com.example.gestionProduit.controller;
import org.springframework.web.bind.annotation.*;
import com.example.gestionProduit.repository.CommentRepository;
import com.example.gestionProduit.repository.ArticleRepository;
import com.example.gestionProduit.entity.Comment;
import com.example.gestionProduit.entity.Article;



@RestController
@RequestMapping("/api/comments")
public class CommentController {
    private final CommentRepository commentRepository;
    private final ArticleRepository articleRepository;

    public CommentController(CommentRepository commentRepository, ArticleRepository articleRepository) {
        this.commentRepository = commentRepository;
        this.articleRepository = articleRepository;
    }
    @PostMapping("/article/{articleId}")
    public Comment createComment(@PathVariable Long articleId, @RequestBody Comment comment) {
        Article article = articleRepository.findById(articleId)
                .orElseThrow(() -> new RuntimeException("Article not found"));
        comment.setArticle(article);
        return commentRepository.save(comment);
    }

}
