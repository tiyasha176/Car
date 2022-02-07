package com.example.demoController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoEntity.Car;
import com.example.demoService.CarService;



@RestController
public class carController {
	@Autowired
	CarService carService;

	@PostMapping("/addCar")
	public void saveCar(@RequestBody Car car) {
		carService.saveCar(car);
	}
	}
