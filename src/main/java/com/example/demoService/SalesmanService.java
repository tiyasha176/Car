package com.example.demoService;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demoEntity.Salesman;
import com.example.demoRepository.SalesmanRepository;

@Service

public class SalesmanService {
	SalesmanRepository salesmanRepository;
	
	public void saveSalesman(@RequestBody Salesman salesman) {
		salesmanRepository.save(salesman);
	}

	public List<Salesman> getSalesman() {
		return (List<Salesman>) salesmanRepository.findAll();
	}
}
