package com.example.gestionProduit.repository;
import com.example.gestionProduit.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {

} 
