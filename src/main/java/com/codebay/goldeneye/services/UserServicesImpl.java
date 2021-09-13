package com.codebay.goldeneye.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codebay.goldeneye.repository.IUser;

@Service
public class UserServicesImpl implements IUserServices {
	
	@Autowired
	private IUser user;
	
	@Override
	public void register(String name, String surname, String department, String location) {
		user.register(name, surname, department, location);
	}

}
