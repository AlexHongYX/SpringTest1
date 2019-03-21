package com.fehead.spring.aop.impl;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	//在方法执行前
	@Before("execution(public int com.fehead.spring.aop.impl.ArithmeticCalculatorImp.*(..))")
	public void beforeMethod(){
		System.out.println("The method begins");
	}
	
	//在方法执行后
	@After("execution(public int com.fehead.spring.aop.impl.ArithmeticCalculatorImp.*(..))")
	public void afterMethod(){
		System.out.println("The method ends");
	}

}
