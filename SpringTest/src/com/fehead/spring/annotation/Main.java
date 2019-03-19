package com.fehead.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fehead.spring.annotation.controller.UserController;
import com.fehead.spring.annotation.respository.UserRepository;
import com.fehead.spring.annotation.service.UserService;

public class Main {

	public static void main(String[] args){
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-annotation.xml");
		
//		TestObject to = (TestObject) ctx.getBean("testObject");
//		System.out.println(to);
		
		UserController uc = (UserController)ctx.getBean("userController");
		System.out.println(uc);
		
		uc.execute();
		
//		UserRepository ur = (UserRepository)ctx.getBean("userRepository");
//		System.out.println(ur);
//		
//		UserService us = (UserService)ctx.getBean("userService");
//		System.out.println(us);
	}
	
}
