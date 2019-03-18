package com.fehead.spring.cycle;

public class Car {
	
	public Car(){
		System.out.println("Car structor...");
	}
	
	private String brand;

	public String getBrand() {
		System.out.println("Get Car...");
		return brand;
	}

	public void setBrand(String brand) {
		System.out.println("Set Car...");
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + "]";
	}
	
	public void init(){
		System.out.println("Init Car...");
	}
	
	public void destroy(){
		System.out.println("Destroy Car...");
	}
	
}
