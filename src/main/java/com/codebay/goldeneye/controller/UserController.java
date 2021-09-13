package com.codebay.goldeneye.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
	
    private final String SYMBOL = "@";
    private final String GOLDEN = "goldeneye.com";
    
    @GetMapping("/register")
    public String getEmail(
    		@RequestParam String name, 
    		@RequestParam String surname, 
    		@RequestParam String department, 
    		@RequestParam String location,
    		Model IModel) {
    	
    	
	    String email = "";
	    
	    String firstLetter = String.valueOf(name.charAt(0));
	    
	    email = 
	    firstLetter.toLowerCase() + 
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
