package com.spring.rest.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.spring.rest.models.Job;

/**
 * Project: Recruitement Agency App Version: 1.0 Author: Kei
 * Mizubuchi(300936630) Date: March 22th, 2020
 * 
 */

@Service
public class JobService {
    
    // mock job repository
    Map<Integer, Job> jobRepository = new HashMap<>();
    
    // add a job to the repository
    public void addJob(Job job) throws Exception {
        // check existence
        if (jobRepository.containsKey(job.getJobId())) {
            throw new Exception("Job Id already exists");
        } else {
            jobRepository.put(job.getJobId(), job);
        }
    }
    
    // get the list of jobs
    public Iterable<Job> getJobs() {
        return jobRepository.values();
    }
    
    // get a job specified by jobId
    public Job getJob(int jobId) throws Exception {
        if (jobRepository.containsKey(jobId)) {
            return jobRepository.get(jobId);
        } else {
            throw new Exception("Job Id not found");
        }
    }
    
    // update a job in the repository
    public void updateJob(Job job) throws Exception {
        if (jobRepository.containsKey(job.getJobId())) {
            jobRepository.put(job.getJobId(), job);
        } else {
            throw new Exception("Job Id not found");
        }
    }
    
    // delete a job from the repository
    public void deleteJob(int jobId) throws Exception {
        if (jobRepository.containsKey(jobId)) {
            jobRepository.remove(jobId);
        } else {
            throw new Exception("Job Id not found");
        }
    }
    
}
