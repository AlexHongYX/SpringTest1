package com.fehead.spring.bean;

import java.util.List;

public class PersonList {
	private String name;
	private int age;
	private List<Car> cars;
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	public PersonList(String name, int age, List<Car> cars) {
		super();
		this.name = name;
		this.age = age;
		this.cars = cars;
	}
	public PersonList(){
		
	}
	@Override
	public String toString() {
		return "PersonList [name=" + name + ", age=" + age + ", cars=" + cars + "]";
	}
	
	
}
