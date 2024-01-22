package com.ijse.cakeshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ijse.cakeshop.entity.Category;

@Service
public interface CategoryService {
    List<Category> getAllCategories();
    Category findCategoryById(Long CategoryId);
    Category createCategory(Category category);
    Category updateCategory(Long CategoryId, Category category);
}
