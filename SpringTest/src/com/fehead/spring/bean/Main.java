package com.fehead.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args){
		 
		/*
		//创建HelloWorld的一个对象
		HelloWorld helloworld = new HelloWorld();
		//为name属性赋值
		helloworld.setName("asf");
		//调用hello方法
		helloworld.hello();
		*/
		
		//1、创建Spring的IOC容器对象
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*
		//2、从IOC容器中获取Bean实例
		HelloWorld helloworld = (HelloWorld)ctx.getBean("hellworld");
		
		//3、调用hello方法
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
