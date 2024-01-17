package com.amigoscode.customer;

import org.springframework.data.jpa.repository.JpaRepository;

// @Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
