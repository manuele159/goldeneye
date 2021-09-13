package com.codebay.goldeneye.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codebay.goldeneye.services.UserServicesImpl;

@Controller
public class UserController {
	
    private final String SYMBOL = "@";
    private final String GOLDEN = "goldeneye.com";
    
    @GetMapping("/register")
    public String getEmail(
    		@RequestParam String name, /*Request all the param, the data is also required on the front end*/
    		@RequestParam String surname, 
    		@RequestParam String department, 
    		@RequestParam String location,
    		Model IModel) {
    	
    	UserServicesImpl userServices = new UserServicesImpl();
    	userServices.register(name, surname, department, location);
    	
	    String email = "";
	    //Getting the first letter of the name
	    String firstLetter = String.valueOf(name.charAt(0));
	    
	    //Concat all the string for the email
	    //And transform all the data to lower case
	    email = 
	    firstLetter.toLowerCase() +
	    /*In case some put both last names, only get the first one*/
	    surname.split(" ")[0].toLowerCase() + 
	    "." + 
	    department.toLowerCase() + 
	    SYMBOL + 
	    location.toLowerCase() + 
	    "." + 
	    GOLDEN;
	    
	    IModel.addAttribute("email", email.replace(" ", ""));
    	
    	return "register";
    }
}
