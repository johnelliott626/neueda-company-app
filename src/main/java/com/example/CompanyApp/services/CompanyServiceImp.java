package com.example.CompanyApp.services;

import com.example.CompanyApp.dataaccess.CompanyRepository;
import com.example.CompanyApp.models.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImp implements CompanyService {

    CompanyRepository companyRepository;

    @Override
    public Iterable<Company> findAll() {
        return companyRepository.findAll();
    }

    @Override
    public Iterable<Company> findAllByOrderBySales() {
        return companyRepository.findAllByOrderBySales();
    }

    @Override
    public Iterable<Company> findBySalesGreaterThan(int amount) {
        return companyRepository.findBySalesGreaterThan(amount);
    }

    @Autowired
    public void setCompanyRepository(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }
}
