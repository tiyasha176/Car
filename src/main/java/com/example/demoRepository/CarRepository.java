package com.example.demoRepository;

import org.springframework.data.repository.CrudRepository;

import com.example.demoEntity.Car;

public interface CarRepository extends CrudRepository<Car, Integer> {

}
