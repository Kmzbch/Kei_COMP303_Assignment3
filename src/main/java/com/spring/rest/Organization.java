package com.spring.rest;

import org.springframework.stereotype.Component;

@Component
public class Organization {
    // fields
    private int orgId;
    private String orgName;
    private String address;
    private String postalCode;
    private String phoneNo;
    private String email;
    private String website;
    
    // constructor
    public Organization() {
        super();
    }
    
    // getter for orgId;
    public int getOrgId() {
        return orgId;
    }
    
    // setter for orgId;
    public void setOrgId(int orgId) {
        this.orgId = orgId;
    }
    
    // getter for orgName;
    public String getOrgName() {
        return orgName;
    }
    
    // setter for orgName;
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
    
    // getter for address;
    
    public String getAddress() {
        return address;
    }
    
    // setter for address;
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    // getter for postalCode;
    public String getPostalCode() {
        return postalCode;
    }
    
    // setter for postalCode;
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    
    // getter for phoneNo;
    public String getPhoneNo() {
        return phoneNo;
    }
    
    // setter for phoneNo;
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    
    // getter for email;
    public String getEmail() {
        return email;
    }
    
    // setter for email;
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    // getter for website;
    public String getWebsite() {
        return website;
    }
    
    // setter for website;
    public void setWebsite(String website) {
        this.website = website;
    }
    
}
