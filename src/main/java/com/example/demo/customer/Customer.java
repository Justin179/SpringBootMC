package com.example.demo.customer;

public class Customer {
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private final Long id;
    private final String name;


    Customer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
