package com.fitkitapp.server.controller;

import com.fitkitapp.server.models.Company;
import com.fitkitapp.server.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Boris on 16.07.2017.
 */
@RestController
@CrossOrigin
@RequestMapping("company")
public class CompanyController {

    private final CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @RequestMapping(value = "/reg",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<Company> createNewCompany(@RequestBody Company company){
        return new ResponseEntity<>(companyService.createNewCompany(company), HttpStatus.OK);
    }
}
