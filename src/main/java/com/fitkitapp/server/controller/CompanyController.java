package com.fitkitapp.server.controller;

import com.fitkitapp.server.models.Company;
import com.fitkitapp.server.models.FullInfo;
import com.fitkitapp.server.models.Gym;
import com.fitkitapp.server.models.Token;
import com.fitkitapp.server.service.CompanyService;
import com.fitkitapp.server.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created on 16.07.2017
 * @author boris
 */
@RestController
@CrossOrigin
@RequestMapping("company")
public class CompanyController {

    private final CompanyService companyService;
    private final Utils utils;

    @Autowired
    public CompanyController(CompanyService companyService, Utils utils) {
        this.companyService = companyService;
        this.utils = utils;
    }

    @PostMapping("/reg")
    @ResponseBody
    public ResponseEntity<Object> createNewCompany(@RequestBody Company company) {
        Company comp = companyService.createNewCompany(company);
        if (comp == null) {
            return new ResponseEntity<>("Company already exist", HttpStatus.CONFLICT);
        }
        Token token = new Token();
        token.setToken(utils.buildJwt(comp.getCompanyName()));
        token.setId(comp.getId());
        return new ResponseEntity<>(token, HttpStatus.OK);
    }

    @PostMapping("/gym")
    public ResponseEntity<Object> createNewGym(@RequestHeader("authorization") String token, @RequestBody FullInfo gym) {
        Gym newGym = new Gym();
        newGym.setFullInfo(gym);
        String companyName = utils.parsJwt(token);
        Gym savedGym = companyService.createNewGym(newGym, companyName);
        return new ResponseEntity<>(savedGym, HttpStatus.OK);
    }
}
