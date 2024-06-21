package com.project.product_categories.product_categories_crud.service;

import com.project.product_categories.product_categories_crud.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ProductService {
    Page<Product> getAllProducts(Pageable pageable);
    Product createProduct(Product product);
    Optional<Product> getProductById(Long id);
    Product updateProduct(Long id, Product product);
    boolean deleteProduct(Long id);
}
