package com.kodreis.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kodreis.mongodb.entity.Customer;

public interface CustomerRepository extends MongoRepository<Customer, Integer> {

}
