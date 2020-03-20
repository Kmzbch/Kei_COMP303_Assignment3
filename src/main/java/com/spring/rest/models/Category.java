package com.spring.rest.models;

import org.springframework.stereotype.Component;

/**
 * Project: Recruitement Agency App Version: 1.0 Author: Kei
 * Mizubuchi(300936630) Date: March 22th, 2020
 * 
 */

@Component
public class Category {
    // fields
    private int jobCatId;
    private String catCode;
    private String catName;
    private String catDesc;
    
    // constructors
    public Category() {
        
    }
    
    public Category(int jobCatId, String catCode, String catName, String catDec) {
        this.jobCatId = jobCatId;
        this.catCode = catCode;
        this.catName = catName;
        this.catDesc = catDesc;
    }
    
    // getter for jobCatId
    public int getJobCatId() {
        return jobCatId;
    }
    
    // setter for jobCatId
    public void setJobCatId(int jobCatId) {
        this.jobCatId = jobCatId;
    }
    
    // getter for catCode
    public String getCatCode() {
        return catCode;
    }
    
    // setter for catCode
    public void setCatCode(String catCode) {
        this.catCode = catCode;
    }
    
    // getter for catName
    public String getCatName() {
        return catName;
    }
    
    // setter for catName
    public void setCatName(String catName) {
        this.catName = catName;
    }
    
    // getter for catDesc
    public String getCatDesc() {
        return catDesc;
    }
    
    // setter for catDesc
    public void setCatDesc(String catDesc) {
        this.catDesc = catDesc;
    }
    
}
