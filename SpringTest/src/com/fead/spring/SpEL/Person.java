package com.fead.spring.SpEL;

public class Person {
	
	private String name;
	private Car car;
	//����address bean�е�city����
	private String city;
	
	//����car��priceȷ��info��car��price>=300000:���죬���򣺰���
	private String info;
	
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", car=" + car + ", city=" + city + ", info=" + info + "]";
	}
	
	
	
	
	
	
}
