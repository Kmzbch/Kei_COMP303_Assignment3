package com.spring.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    // root
    @ResponseBody
    @RequestMapping("")
    public String home() {
        return "Recruitment Agency App";
    }
    
    @ResponseBody
    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about() {
        return "About Us";
    }
    
}
