package com.example.gestionProduit.controller;
import com.example.gestionProduit.entity.Product;
import com.example.gestionProduit.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ProductViewController {

    private final ProductService productService;
    public ProductViewController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/products")
    public String viewProducts(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "products";
    }
    @GetMapping("/products/new")
    public String showCreateForm(Model model) {
        model.addAttribute("product", new Product());
        return "add-product";
    }
    @PostMapping("/products/save")
    public String saveProduct(Product product) {
        productService.createProduct(product);
        return "redirect:/products";
    }

}
