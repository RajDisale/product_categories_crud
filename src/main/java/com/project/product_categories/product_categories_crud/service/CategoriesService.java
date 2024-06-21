package com.project.product_categories.product_categories_crud.service;

import com.project.product_categories.product_categories_crud.model.Categories;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface CategoriesService {
    Page<Categories> getAllCategories(Pageable pageable);
    Categories createCategory(Categories category);
    Optional<Categories> getCategoryById(Long id);
    Categories updateCategory(Long id, Categories category);
    boolean deleteCategory(Long id);
}
