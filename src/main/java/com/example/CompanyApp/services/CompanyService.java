package com.example.CompanyApp.services;

import com.example.CompanyApp.models.Company;

public interface CompanyService {
    public Iterable<Company> findAll();

    public Iterable<Company> findAllByOrderBySales();

    public Iterable<Company> findBySalesGreaterThan(int amount);
}
