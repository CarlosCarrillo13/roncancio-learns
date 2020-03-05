package com.roncancio.prueba.roncancioprueba.rest;

import com.roncancio.prueba.roncancioprueba.entity.Company;
import com.roncancio.prueba.roncancioprueba.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @GetMapping("/by-id/{id}")
    public ResponseEntity getById(@PathVariable Long id) {
        return new ResponseEntity(companyService.getCompany(id), HttpStatus.OK);
    }


    @PostMapping("/save")
    public ResponseEntity saveCompany(@RequestBody Company company) {
        return new ResponseEntity(companyService.saveCompany(company), HttpStatus.CREATED);
    }

}
