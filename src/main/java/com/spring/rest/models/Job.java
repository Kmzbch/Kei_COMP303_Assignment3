package com.spring.rest.models;

import org.springframework.stereotype.Component;

/**
 * Project: Recruitement Agency App Version: 1.0 Author: Kei
 * Mizubuchi(300936630) Date: March 22th, 2020
 * 
 */

@Component
public class Job {
    // fields
    private int jobId;
    private String jobCode;
    private String jobName;
    private String jobDesc;
    private String pubDate;
    private int numVacancy;
    
    // constructors
    public Job() {
        
    }
    
    public Job(int jobId, String jobCode, String jobName, String jobDesc, String pubDate, int numVacancy) {
        this.jobId = jobId;
        this.jobCode = jobCode;
        this.jobName = jobName;
        this.jobDesc = jobDesc;
        this.pubDate = pubDate;
        this.numVacancy = numVacancy;
    }
    
    // getter for jobId
    public int getJobId() {
        return jobId;
    }
    
    // setter for jobId
    public void setJobId(int jobId) {
        this.jobId = jobId;
    }
    
    // getter for jobCode
    public String getJobCode() {
        return jobCode;
    }
    
    // setter for jobCode
    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }
    
    // getter for jobName
    public String getJobName() {
        return jobName;
    }
    
    // setter for jobName
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
    
    // getter for jobDesc
    public String getJobDesc() {
        return jobDesc;
    }
    
    // setter for jobDesc
    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }
    
    // getter for pubDate
    public String getPubDate() {
        return pubDate;
    }
    
    // setter for pubDate
    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }
    
    // getter for numVacancy
    public int getNumVacancy() {
        return numVacancy;
    }
    
    // setter for numVacancy
    public void setNumVacancy(int numVacancy) {
        this.numVacancy = numVacancy;
    }
    
}
