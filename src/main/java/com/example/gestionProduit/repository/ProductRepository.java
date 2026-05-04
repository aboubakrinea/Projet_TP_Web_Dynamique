package com.example.gestionProduit.repository;
import com.example.gestionProduit.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductRepository extends JpaRepository<Product, Long> {

}
