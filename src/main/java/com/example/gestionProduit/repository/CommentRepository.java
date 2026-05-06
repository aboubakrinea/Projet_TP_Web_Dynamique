package com.example.gestionProduit.repository;
import com.example.gestionProduit.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
