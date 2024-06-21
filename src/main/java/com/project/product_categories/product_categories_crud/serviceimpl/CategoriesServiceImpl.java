package com.project.product_categories.product_categories_crud.serviceimpl;

import com.project.product_categories.product_categories_crud.model.Categories;
import com.project.product_categories.product_categories_crud.repository.CategoriesRepository;
import com.project.product_categories.product_categories_crud.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriesServiceImpl implements CategoriesService {

    @Autowired
    private CategoriesRepository categoriesRepository;

    @Override
    public Page<Categories> getAllCategories(Pageable pageable) {
        return categoriesRepository.findAll(pageable);
    }

    @Override
    public Categories createCategory(Categories category) {
        return categoriesRepository.save(category);
    }

    @Override
    public Optional<Categories> getCategoryById(Long id) {
        return categoriesRepository.findById(id);
    }

    @Override
    public Categories updateCategory(Long id, Categories category) {
        Optional<Categories> existingCategory = categoriesRepository.findById(id);
        if (existingCategory.isPresent()) {
            Categories updatedCategory = existingCategory.get();
            updatedCategory.setCategoryName(category.getCategoryName());
            updatedCategory.setProducts(category.getProducts());
            return categoriesRepository.save(updatedCategory);
        }
        return null;
    }

    @Override
    public boolean deleteCategory(Long id) {
        if (categoriesRepository.existsById(id)) {
            categoriesRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
