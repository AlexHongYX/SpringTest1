package com.fehead.spring.annotation.respository;

import org.springframework.stereotype.Repository;

@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("UserRepository save...");
	}

}
