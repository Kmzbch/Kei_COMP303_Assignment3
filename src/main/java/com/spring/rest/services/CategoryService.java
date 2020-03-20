package com.spring.rest.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.spring.rest.models.Category;

/**
 * Project: Recruitement Agency App Version: 1.0 Author: Kei
 * Mizubuchi(300936630) Date: March 22th, 2020
 * 
 */

@Service
public class CategoryService {
    // mock category repository
    Map<Integer, Category> categoryRepository = new HashMap<>();
    
    // add a category to the repository
    public void addCategory(Category category) throws Exception {
        // check existence
        if (categoryRepository.containsKey(category.getJobCatId())) {
            throw new Exception("Category Id already exists");
        } else {
            categoryRepository.put(category.getJobCatId(), category);
        }
    }
    
    // get the list of categories
    public Iterable<Category> getCategories() {
        return categoryRepository.values();
    }
    
    // get a category specified by categoryId
    public Category getCategory(int jobCatId) throws Exception {
        if (categoryRepository.containsKey(jobCatId)) {
            return categoryRepository.get(jobCatId);
        } else {
            throw new Exception("Category Id not found");
        }
    }
    
    // update a category in the repository
    public void updateCategory(Category category) throws Exception {
        if (categoryRepository.containsKey(category.getJobCatId())) {
            categoryRepository.put(category.getJobCatId(), category);
        } else {
            throw new Exception("Category Id not found");
        }
    }
    
    // delete a category from the repository
    public void deleteCategory(int jobCatId) throws Exception {
        if (categoryRepository.containsKey(jobCatId)) {
            categoryRepository.remove(jobCatId);
        } else {
            throw new Exception("Category Id not found");
        }
    }
    
}
