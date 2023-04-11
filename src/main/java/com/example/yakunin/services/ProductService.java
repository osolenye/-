package com.example.yakunin.services;

import com.example.yakunin.models.Product;
import com.example.yakunin.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//просмотр всех товаров, добавление и удаление товаров
@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    //returns the list of our products
    public List<Product> listProducts(String title) {
        if (title != null) return productRepository.findByTitle(title);
        return productRepository.findAll();
    }

    //gets every form values from product object and saves it in products list
    public void saveProduct(Product product) {
        log.info("Saving new {}", product);
        productRepository.save(product);
    }

    //method for deleting some of ads
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
    //если в листе есть подходящий айди, то возвращает айди, иначе нулл
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }
}

