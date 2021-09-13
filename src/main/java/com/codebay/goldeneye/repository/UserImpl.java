package com.codebay.goldeneye.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import com.codebay.goldeneye.WebApplication;

@Repository
public class UserImpl implements IUser{
	private static Logger LOG = LoggerFactory.getLogger(WebApplication.class);
	
	private String name;
	private String surname;
	private String department;
	private String location;
	
	public UserImpl() {}
	
	@Override
	public void register(
			String name, 
			String surname, 
    		String department, 
    		String location) {
		
		this.name = name;
		this.surname = surname;
		this.department = department;
		this.location = location;
		
		LOG.info("User registered");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
}
