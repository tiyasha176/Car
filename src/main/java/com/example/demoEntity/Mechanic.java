package com.example.demoEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Mechanic {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer mechanicId;
	
	private String name;

	public Integer getMechanicId() {
		return mechanicId;
	}

	public void setMechanicId(Integer mechanicId) {
		this.mechanicId = mechanicId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
