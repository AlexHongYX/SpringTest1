package com.fehead.spring.aop.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args){
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring-AOP.xml");
		
		ArithmeticCalculatorImp ac = (ArithmeticCalculatorImp) ctx.getBean("arithmeticCalculator");
		
		System.out.println(ac.getClass().getName());
		
		int result = ac.add(5, 6);
		System.out.println(result);
		
		result = ac.mul(3, 4);
		System.out.println(result);
	}
}
