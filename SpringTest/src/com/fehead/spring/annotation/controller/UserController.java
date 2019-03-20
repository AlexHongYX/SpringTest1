package com.fehead.spring.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.fehead.spring.annotation.service.UserService;

@Controller
public class UserController { 
	
	//@Autowired
	private UserService userService;
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public void execute(){
		System.out.println("UserController execute..."); 
		userService.add();
	}
}
