package com.example.demoRepository;

import org.springframework.data.repository.CrudRepository;

import com.example.demoEntity.Salesman;

public interface SalesmanRepository extends CrudRepository<Salesman, Integer>{

}
