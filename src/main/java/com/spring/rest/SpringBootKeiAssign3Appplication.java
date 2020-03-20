package com.spring.rest;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.spring.rest.models.Category;
import com.spring.rest.models.Job;
import com.spring.rest.models.Organization;
import com.spring.rest.services.CategoryService;
import com.spring.rest.services.JobService;
import com.spring.rest.services.OrganizationService;

/**
 * Project: Recruitement Agency App Version: 1.0 Author: Kei
 * Mizubuchi(300936630) Date: March 22th, 2020
 * 
 */

@SpringBootApplication(scanBasePackages = { "com.spring.rest" })
public class SpringBootKeiAssign3Appplication {
    
    public static void main(String[] args) {
        SpringApplication.run(SpringBootKeiAssign3Appplication.class, args);
    }
    
    // initializer for job
    @Bean
    public ApplicationRunner jobsInitializer(JobService jobService) {
        return args -> {
            // set initial data
            jobService.addJob(new Job(1, "J001", "Software Developer", "Tech", "2020/01/01", 1));
            jobService.addJob(new Job(2, "J002", "Quality Assurance", "Tech", "2020/02/02", 2));
            jobService.addJob(new Job(3, "J003", "IT Associate", "Tech", "2020/03/03", 3));
        };
    }
    
    // initializer for organization
    @Bean
    public ApplicationRunner organizationsInitializer(OrganizationService organizationService) {
        return args -> {
            // set initial data
            organizationService.addOrganization(new Organization(1, "Gen Tech", "941 Progress Ave", "M1N2F3",
                    "123-456-7890", "aaa@example.com", "http://example.com"));
            organizationService.addOrganization(new Organization(2, "Progig", "18 Huron Ave", "A1B2C3", "123-456-7891",
                    "bbb@example.com", "http://example.com"));
            organizationService.addOrganization(new Organization(3, "Wemleath", "66 Richmond St", "G1E2Q3",
                    "123-456-7892", "ccc@example.com", "http://example.com"));
        };
    }
    
    // initializer for category
    @Bean
    public ApplicationRunner categoriesInitializer(CategoryService categoryService) {
        return args -> {
            categoryService.addCategory(new Category(1, "C001", "Administrative", "..."));
            categoryService.addCategory(new Category(2, "C002", "Collection", "..."));
            categoryService.addCategory(new Category(3, "C003", "Construction", "..."));
            categoryService.addCategory(new Category(4, "C004", "Customer Service", "..."));
            categoryService.addCategory(new Category(5, "C005", "Data Entry", "..."));
            categoryService.addCategory(new Category(6, "C006", "Engineering", "..."));
            categoryService.addCategory(new Category(7, "C007", "Executive Assistant", "..."));
            categoryService.addCategory(new Category(8, "C008", "Human Resource", "..."));
            categoryService.addCategory(new Category(9, "C009", "Information Technology", "..."));
            categoryService.addCategory(new Category(10, "C010", "Insurance", "..."));
            categoryService.addCategory(new Category(11, "C011", "Logistics", "..."));
            categoryService.addCategory(new Category(12, "C012", "Management", "..."));
            categoryService.addCategory(new Category(13, "C013", "Manufacturing", "..."));
            categoryService.addCategory(new Category(14, "C014", "Marketing", "..."));
            categoryService.addCategory(new Category(15, "C015", "Operations", "..."));
            categoryService.addCategory(new Category(16, "C016", "Other", "..."));
            categoryService.addCategory(new Category(17, "C017", "Reception", "..."));
            categoryService.addCategory(new Category(18, "C018", "Sales/Business", "..."));
            categoryService.addCategory(new Category(19, "C019", "Supply Chain", "..."));
            categoryService.addCategory(new Category(20, "C020", "Trades", "..."));
        };
    }
    
}
