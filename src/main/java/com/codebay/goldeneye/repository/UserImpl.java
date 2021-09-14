package com.codebay.goldeneye.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.codebay.goldeneye.WebApplication;
import com.codebay.goldeneye.constants.TemplatesConstants;

@Repository
public class UserImpl implements IUser{

	private static Logger LOG = LoggerFactory.getLogger(WebApplication.class);
	
	private String name;
	private String surname;
	private String department;
	private String location;
	private String email;
	
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
		
		generateEmail();
		
		LOG.info("User registered");		
	}
	
	private void generateEmail() {
		LOG.info("Generating email");
		String email = "";
	    //Getting the first letter of the name
	    String firstLetter = String.valueOf(name.charAt(0));
	    
	    //Concat all the string for the email
	    email = 
	    firstLetter +
	    /*In case some put both last names, only get the first one*/
	    surname.split(" ")[0] + 
	    "." + 
	    department + 
	    "@" + 
	    location + 
	    "." + 
		    TemplatesConstants.GOLDEN;
	    
	    this.email = email.replace(" ", "").toLowerCase();

		LOG.info("Email generated");
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
