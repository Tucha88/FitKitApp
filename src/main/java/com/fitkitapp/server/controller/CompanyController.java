package com.fitkitapp.server.controller;

import com.fitkitapp.server.models.Company;
import com.fitkitapp.server.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Boris on 16.07.2017.
 */
@RestController
@CrossOrigin
@RequestMapping(name = "company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @RequestMapping(value = "register",method = RequestMethod.POST)
    public ResponseEntity<Company> createNewCompany(@RequestBody Company company){
        return new ResponseEntity<>(companyService.createNewCompany(company), HttpStatus.OK);
    }
}
