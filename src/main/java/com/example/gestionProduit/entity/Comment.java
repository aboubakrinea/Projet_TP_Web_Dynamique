package com.example.gestionProduit.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String text;
    private String author;
    
    @ManyToOne
    @JoinColumn(name = "article_id")
    @JsonBackReference
    private Article article;

    
}
