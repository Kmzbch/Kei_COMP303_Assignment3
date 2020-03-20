package com.spring.rest.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.models.Category;
import com.spring.rest.services.CategoryService;

/**
 * Project: Recruitement Agency App Version: 1.0 Author: Kei
 * Mizubuchi(300936630) Date: March 22th, 2020
 * 
 */

@RestController
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    
    // GET
    @RequestMapping(value = "/category/{jobCatId}", method = RequestMethod.GET)
    Category getcategory(@PathVariable("jobCatId") int jobCatId) throws Exception {
        return categoryService.getCategory(jobCatId);
    }
    
    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    Iterable<Category> getCategories() {
        return categoryService.getCategories();
    }
    
    // POST
    @RequestMapping(value = "/category", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    void addcategory(@RequestBody Category category) throws Exception {
        categoryService.addCategory(category);
    }
    
    // PUT
    @RequestMapping(value = "/category/{jobCatId}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    void updatecategory(@PathVariable("jobCatId") int jobCatId, @RequestBody Category category) throws Exception {
        category.setJobCatId(jobCatId);
        categoryService.updateCategory(category);
    }
    
    // DELETE
    @RequestMapping(value = "/category/{jobCatId}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    void deletecategory(@PathVariable("jobCatId") int jobCatId) throws Exception {
        categoryService.deleteCategory(jobCatId);
    }
    
}