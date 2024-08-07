package com.example.CompanyApp.dataaccess;

import com.example.CompanyApp.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
    public Iterable<Company> findAllByOrderBySales();

    public Iterable<Company> findBySalesGreaterThan(int amount);
}