package com.example.ex06.service;

import com.example.ex06.entiy.Member;
import com.example.ex06.entiy.Product;
import com.example.ex06.repository.ProductRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Product update(Long id, Product product) throws Exception{
        Optional<Product> productOptional = productRepository.findById(id);
        if (productOptional.isPresent()) {
            productRepository.save(product);
        } else {
            throw new Exception("수정할 내용이 없습니다.");
        }
        return product;
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }
    public boolean deleteproduct(Long id) throws Exception{
        Product product = productRepository
                .findById(id)
                .orElseThrow(() -> new Exception("해당하는 id"+id+"가 없어서 삭제할 내용이 없습니다."));
        productRepository.delete(product);
        return true;
    }
}
