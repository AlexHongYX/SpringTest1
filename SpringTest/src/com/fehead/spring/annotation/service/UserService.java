package com.fehead.spring.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fehead.spring.annotation.respository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	public void add(){
		System.out.println("UserService add...");
		userRepository.save();
	}
}
