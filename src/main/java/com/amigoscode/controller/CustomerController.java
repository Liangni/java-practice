package com.amigoscode.controller;

import com.amigoscode.model.Customer;
import com.amigoscode.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getALlCustomers();
    }

    @GetMapping("{customerId}")
    public Customer getCustomer(@PathVariable("customerId") Integer customerId) {
        return customerService.getCustomer(customerId);
    }
//    @PostMapping
//    public void registerCustomer(@RequestBody CustomerRegistrationRequest request) {
//        customerService.addCustomer(request);
//    }
}
