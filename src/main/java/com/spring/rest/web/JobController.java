package com.spring.rest.web;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.rest.models.Job;
import com.spring.rest.services.JobService;

/**
 * Project: Recruitement Agency App Version: 1.0 Author: Kei
 * Mizubuchi(300936630) Date: March 22th, 2020
 * 
 */

@RestController
public class JobController {
    @Autowired
    JobService jobService;
    
    // GET - show list
    @GetMapping(value = "/jobs")
    ModelAndView getJobs() throws Exception {
        
        // set job list to show
        ModelAndView mv = new ModelAndView();
        mv.setViewName("jobinfo");
        mv.addObject("jobList", jobService.getJobs());
        
        return mv;
    }
    
    // POST - add job
    @PostMapping(value = "/job/add", consumes = "application/x-www-form-urlencoded")
    @ResponseStatus(value = HttpStatus.OK)
    void addJob(Job job, HttpServletResponse httpResponse) throws Exception {
        
        // add new job to the repository
        jobService.addJob(job);
        
        // redirect to job list
        httpResponse.sendRedirect("/jobs");
    }
    
    // GET - find by jobId
    @GetMapping(value = "/job/edit/{jobId}")
    ModelAndView getJob(@PathVariable("jobId") int jobId) throws Exception {
        
        // set Job to edit
        ModelAndView mv = new ModelAndView();
        mv.setViewName("editJob");
        mv.addObject("job", jobService.getJob(jobId));
        
        return mv;
    }
    
    // PUT - edit job
    @PostMapping(value = "/job/edit/{jobId}", consumes = "application/x-www-form-urlencoded")
    @ResponseStatus(value = HttpStatus.OK)
    void updateJob(Job job, HttpServletResponse httpResponse) throws Exception {
        
        // update the job
        jobService.updateJob(job);
        
        // redirect to job list
        httpResponse.sendRedirect("/jobs");
    }
    
    // DELETE - delete job
    @GetMapping(value = "/job/delete/{jobId}")
    @ResponseStatus(value = HttpStatus.OK)
    void deleteJob(@PathVariable("jobId") int jobId, HttpServletResponse httpResponse) throws Exception {
        
        // delete job
        jobService.deleteJob(jobId);
        
        // redirect to job list
        httpResponse.sendRedirect("/jobs");
    }
    
}