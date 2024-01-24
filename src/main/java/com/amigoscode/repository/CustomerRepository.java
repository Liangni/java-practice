package com.amigoscode.repository;

import com.amigoscode.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

// @Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    boolean existsCustomerByEmail(String email);
}
