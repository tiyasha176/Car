package com.example.demoController;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demoEntity.Salesman;
import com.example.demoService.SalesmanService;



@RestController
public class SalesmanController {
	@Autowired
    SalesmanService salesmanService;
	
	@PostMapping("/salesman")
	public String addsalesman(@RequestBody Salesman salesman) {
		salesmanService.saveSalesman(salesman);
		return "salesman added";	
	}
	@GetMapping("/salesman")
	public List<Salesman> getSalesman(){
		return salesmanService.getSalesman();
		
	}

}
