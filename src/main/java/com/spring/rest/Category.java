package com.spring.rest;

import org.springframework.stereotype.Component;

@Component
public class Category {
    // fields
    private int jobCatId;
    private String catCode;
    private String catName;
    private String catDesc;
    
    // constructor
    public Category() {
        super();
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
