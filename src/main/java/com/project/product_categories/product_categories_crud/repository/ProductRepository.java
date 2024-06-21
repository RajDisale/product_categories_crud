package com.project.product_categories.product_categories_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.product_categories.product_categories_crud.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
