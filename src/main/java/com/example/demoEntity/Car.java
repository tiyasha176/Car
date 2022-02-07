package com.example.demoEntity;


	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.validation.constraints.NotBlank;


		@Entity
		public class Car {
			@Id
			@GeneratedValue(strategy = GenerationType.AUTO)
			private int carId;

			@NotBlank 
			private long serialNumber;
			
			@NotBlank
			private String model;

			@NotBlank
			private String color;

			public int getCarId() {
				return carId;
			}

			public void setCarId(int carId) {
				this.carId = carId;
			}

			public long getSerialNumber() {
				return serialNumber;
			}

			public void setSerialNumber(long serialNumber) {
				this.serialNumber = serialNumber;
			}

			public String getModel() {
				return model;
			}

			public void setModel(String model) {
				this.model = model;
			}

			public String getColor() {
				return color;
			}

			public void setColor(String color) {
				this.color = color;
			}
			
		}
	



