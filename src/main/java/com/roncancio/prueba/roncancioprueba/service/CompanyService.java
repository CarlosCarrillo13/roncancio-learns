package com.roncancio.prueba.roncancioprueba.service;

import com.roncancio.prueba.roncancioprueba.entity.Company;
import com.roncancio.prueba.roncancioprueba.repos.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    public Company saveCompany(Company company) {
        return companyRepository.save(company);
    }

    public Company getCompany(Long id) {
        return companyRepository.findById(id).get();
    }
}
