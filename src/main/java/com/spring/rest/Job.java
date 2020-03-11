package com.spring.rest;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Job {
    // fields
    private int jobId;
    private String jobCode;
    private String jobName;
    private String jobDesc;
    private Date pubDate;
    private int numVacancy;
    
    // constructor
    public Job() {
        
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
    public Date getPubDate() {
        return pubDate;
    }
    
    // setter for pubDate
    public void setPubDate(Date pubDate) {
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
