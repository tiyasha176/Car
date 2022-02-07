package com.example.demoEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Salesman {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int salesmanId;

	@NotBlank
	
	private String name;

	public int getSalesmanId() {
		return salesmanId;
	}

	public void setSalesmanId(int salesmanId) {
		this.salesmanId = salesmanId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Salesman(int salesmanId, @NotBlank String name) {
		super();
		this.salesmanId = salesmanId;
		this.name = name;
	}


}
