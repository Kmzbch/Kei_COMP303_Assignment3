package com.spring.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class OrganizationService {
    // mock Organization repository
    Map<Integer, Organization> orgRepository = new HashMap<>();
    
    // add a Organization to the repository
    public void addOrganization(Organization organization) throws Exception {
        // check existence
        if (orgRepository.containsKey(organization.getOrgId())) {
            throw new Exception("Organization Id already exists");
        } else {
            orgRepository.put(organization.getOrgId(), organization);
        }
    }
    
    // get the list of Organizations
    public Iterable<Organization> getOrganizations() {
        return orgRepository.values();
    }
    
    // get a Organization specified by OrganizationId
    public Organization getOrganization(int orgId) throws Exception {
        if (orgRepository.containsKey(orgId)) {
            return orgRepository.get(orgId);
        } else {
            throw new Exception("Organization Id not found");
        }
    }
    
    // update a Organization in the repository
    public void updateOrganization(Organization organization) throws Exception {
        if (orgRepository.containsKey(organization.getOrgId())) {
            orgRepository.put(organization.getOrgId(), organization);
        } else {
            throw new Exception("Organization Id not found");
        }
    }
    
    // delete a Organization from the repository
    public void deleteOrganization(int orgId) throws Exception {
        if (orgRepository.containsKey(orgId)) {
            orgRepository.remove(orgId);
        } else {
            throw new Exception("Organization Id not found");
        }
    }
    
}
