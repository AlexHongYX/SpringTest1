package com.fead.spring.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fehead.spring.autowire.Address;
import com.fehead.spring.autowire.Car;
import com.fehead.spring.autowire.Person;

public class Main {
	
	public static void main(String[] args){
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-scope.xml");
		
		Car car = (Car)ctx.getBean("car");
		System.out.println(car);
		
		Car car2 = (Car)ctx.getBean("car");
		System.out.println(car==car2);
	}
}
