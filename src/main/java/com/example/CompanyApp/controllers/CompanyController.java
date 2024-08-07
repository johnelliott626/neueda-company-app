package com.example.CompanyApp.controllers;

import com.example.CompanyApp.models.Company;
import com.example.CompanyApp.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {

    CompanyService companyService;

    @GetMapping("/companies")
    public Iterable<Company> getAllCompanies() {
        return companyService.findAll();
    }

    @GetMapping("/companies/orderedbysales")
    public Iterable<Company> getAllCompaniesOrderedBySales() {
        return companyService.findAllByOrderBySales();
    }

    @GetMapping("/companies/salesgreaterthan/{amount}")
    public Iterable<Company> getCompaniesWithSalesGreaterThan(@PathVariable int amount) {
        return companyService.findBySalesGreaterThan(amount);
    }

    @Autowired
    public void setCompanyService(CompanyService companyService) {
        this.companyService = companyService;
    }
}
