package com.example.ex06.controller;

import com.example.ex06.entiy.Product;
import com.example.ex06.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("products")
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
    @PostMapping
    @Operation(summary = "상품등록", description = "새로운 상품을 등록합니다.")
    public Product addProduct(@RequestBody Product product) {
        System.out.println(product);
        return productService.save(product);
    }

    @PutMapping("{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product) throws Exception {
        return productService.update(id,product);
    }
    @DeleteMapping("{id}")
    @Operation(summary = "회원을 삭제합니다.",description = "삭제하고 싶은 id을 입력하세요")
    public boolean deleteproduct(@PathVariable Long id) throws Exception {
        boolean result = productService.deleteproduct(id);
        return result;
    }
}
