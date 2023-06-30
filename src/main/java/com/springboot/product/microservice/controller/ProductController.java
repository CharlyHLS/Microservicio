package com.springboot.product.microservice.controller;

import com.springboot.product.microservice.entity.ProductEntity;
import com.springboot.product.microservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductEntity> getAllProducts(){
        return productRepository.findAll();

        }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    private void createProduct(@RequestBody ProductEntity productEntity){
        productRepository.save(productEntity);
    }
}