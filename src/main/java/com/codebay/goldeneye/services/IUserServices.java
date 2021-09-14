package com.codebay.goldeneye.services;

import com.codebay.goldeneye.repository.IUser;

public interface IUserServices {
	IUser register(String name, 
			String surname, 
    		String department, 
    		String location);
}
