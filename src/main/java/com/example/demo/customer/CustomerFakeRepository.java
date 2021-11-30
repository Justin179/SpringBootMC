package com.example.demo.customer;

import java.util.Arrays;
import java.util.List;


public class CustomerFakeRepository implements CustomerRepo{

    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "Justin", "password", "email@gmail.com"),
                new Customer(2L, "John", "password", "email@gmail.com")
        );
    }
}
