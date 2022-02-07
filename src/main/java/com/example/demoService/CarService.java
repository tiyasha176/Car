package com.example.demoService;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demoEntity.Car;
import com.example.demoRepository.CarRepository;


@Service
public class CarService {
	@Autowired
	CarRepository carRepository;

	
	public void saveCar(@RequestBody Car car) {
		carRepository.save(car);
	}
}
