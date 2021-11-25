package com.example.demo.customer;

import com.example.demo.DemoApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController( CustomerService customerService) { // 注入點
        this.customerService = customerService;
    }

    @GetMapping
    List<Customer> getCustomers(){

        return customerService.getCustomers();
    }
}
