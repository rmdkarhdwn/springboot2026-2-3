package com.example.ex06.controller;

import com.example.ex06.entiy.Product;
import com.example.ex06.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("products")
@RestController
@CrossOrigin
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping
    public List<Product> getProducts() {
        return productService.findAll();
    }

    @GetMapping("{id}")
    public Product getProduct(@PathVariable Long id) {
        Product product = productService.findById(id);
        return product;
    }

}
