package com.fehead.spring.factory;

import java.util.HashMap;
import java.util.Map;

public class InstanceCarFactory {
	
	private Map<String,Car> cars = new HashMap<String, Car>();
	public InstanceCarFactory(){
		cars.put("audi",new Car("audi",300000,240));
		cars.put("ford",new Car("ford",400000,200));
	}
	
	public Car getCar(String brand){
		return cars.get(brand);
	}
}
