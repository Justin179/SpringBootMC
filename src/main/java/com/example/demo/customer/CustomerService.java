package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerService(CustomerRepo customerRepo) { // 因為目前有兩個實作，所以要指明一個
        this.customerRepo = customerRepo;
    }

    List<Customer> getCustomers(){
        return customerRepo.getCustomers();
    }

    Customer getCustomer(Long id){
        return getCustomers()
                .stream()
                .filter(customer -> customer.getId().equals(id))
                .findFirst()
                .orElseThrow(()-> new IllegalStateException("customer not found"));
    }
}
