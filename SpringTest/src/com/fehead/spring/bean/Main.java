package com.fehead.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args){
		 
		/*
		//����HelloWorld��һ������
		HelloWorld helloworld = new HelloWorld();
		//Ϊname���Ը�ֵ
		helloworld.setName("asf");
		//����hello����
		helloworld.hello();
		*/
		
		//1������Spring��IOC��������
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*
		//2����IOC�����л�ȡBeanʵ��
		HelloWorld helloworld = (HelloWorld)ctx.getBean("hellworld");
		
		//3������hello����
		helloworld.hello();
		*/
		Car car = (Car)ctx.getBean("car");
		System.out.println(car);
		
		
		
		Car car2 = (Car)ctx.getBean("car2");
		System.out.println(car2);
		
		Person person1 = (Person)ctx.getBean("person");
		System.out.println(person1);
		
		PersonList person2 = (PersonList)ctx.getBean("person2");
		System.out.println(person2);
		
		PersonMap person3 = (PersonMap)ctx.getBean("person3");
		System.out.println(person3);
		
		DataSource person4 = (DataSource)ctx.getBean("person4");
		System.out.println(person4);
		
		PersonList person5 = (PersonList)ctx.getBean("person5");
		System.out.println(person5);
		
		Person person6 = (Person)ctx.getBean("person6");
		System.out.println(person6);
	}
	
}
