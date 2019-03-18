package com.fead.spring.relation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fehead.spring.autowire.Address;
import com.fehead.spring.autowire.Person;

public class Main {
	
	public static void main(String[] args){
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-relation.xml");
		/*
		Address address = (Address) ctx.getBean("address");
		System.out.println(address);
		*/
		Address address2 = (Address) ctx.getBean("address2");
		System.out.println(address2);
		
		Person person = (Person)ctx.getBean("person");
		System.out.println(person);
	}
}
