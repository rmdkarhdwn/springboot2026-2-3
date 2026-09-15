package com.example.ex06.service;

import com.example.ex06.entiy.Product;
import com.example.ex06.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }
    public Product findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }
}
