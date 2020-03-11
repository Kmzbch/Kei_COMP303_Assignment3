package com.spring.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrganizationController {
    @Autowired
    OrganizationService orgService;
    
    // GET
    @RequestMapping(value = "/organization/{orgId}", method = RequestMethod.GET)
    Organization getOrganization(@PathVariable("orgId") int orgId) throws Exception {
        return orgService.getOrganization(orgId);
    }
    
    @RequestMapping(value = "/organizations", method = RequestMethod.GET)
    Iterable<Organization> getOrganizations() {
        return orgService.getOrganizations();
    }
    
    // POST
    @RequestMapping(value = "/organization", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    void addOrganization(@RequestBody Organization organization) throws Exception {
        orgService.addOrganization(organization);
        ;
    }
    
    // PUT
    @RequestMapping(value = "/organization/{orgId}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    void updateOrganization(@PathVariable("orgId") int orgId, @RequestBody Organization organization) throws Exception {
        organization.setOrgId(orgId);
        orgService.updateOrganization(organization);
    }
    
    // DELETE
    @RequestMapping(value = "/organization/{orgId}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    void deleteOrganization(@PathVariable("orgId") int orgId) throws Exception {
        orgService.deleteOrganization(orgId);
    }
    
}