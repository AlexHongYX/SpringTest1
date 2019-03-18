package com.fehead.spring.autowire;

public class Car {
	
	private String brand;
	private int price;
	private int maxSpeed;
	public String getBrand() {
		
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", maxSpeed=" + maxSpeed + "]";
	}
	
	public Car(){
		System.out.println("Hello");
	}
	
	
}
