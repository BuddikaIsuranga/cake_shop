package com.ijse.cakeshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ijse.cakeshop.entity.Category;
import com.ijse.cakeshop.service.CategoryService;

@RestController
public class CategoryController {

     @Autowired
    private CategoryService categoryService;

    @GetMapping("/categories")
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

     @PostMapping("/categories")
    public Category createCategory(@RequestBody Category category) {
        return categoryService.createCategory(category);
    }

    @GetMapping("/categories/{CategoryId}")
    public Category getCategoryById(@PathVariable Long CategoryId) {
        return categoryService.findCategoryById(CategoryId);
    }

    @PutMapping("/categories/{CategoryId}")
    public Category updateCategory(@PathVariable Long CategoryId, @RequestBody Category category) {
        return categoryService.updateCategory(CategoryId, category);
    }
    
}
