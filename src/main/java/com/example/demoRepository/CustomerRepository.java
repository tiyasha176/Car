package com.example.demoRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demoEntity.Customer;
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>{

}
