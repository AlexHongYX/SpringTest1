package com.fehead.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class autowireTest {
	
	public static void main(String[] args){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-autowire.xml");
		
		Person person = (Person)ctx.getBean("person");
		System.out.println(person);
	}
	
}
