package com.spring.rest.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Project: Recruitement Agency App Version: 1.0 Author: Kei
 * Mizubuchi(300936630) Date: March 22th, 2020
 * 
 */

@Controller
public class HomeController {
    // root
    @RequestMapping("/")
    public String home() {
        return "index";
    }
    
    @RequestMapping("/addJob")
    public String addJob() {
        return "addJob";
    }
    
}
