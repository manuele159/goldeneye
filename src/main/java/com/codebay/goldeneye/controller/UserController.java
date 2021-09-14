package com.codebay.goldeneye.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codebay.goldeneye.constants.TemplatesConstants;
import com.codebay.goldeneye.repository.UserImpl;
import com.codebay.goldeneye.rest.ToolRestApi;
import com.codebay.goldeneye.services.UserServicesImpl;

@Controller
public class UserController {
    
    @Autowired
    private UserServicesImpl userServices;
    
    @GetMapping("/register")
    public String getEmail(
    		@RequestParam String name,
    		@RequestParam String surname, 
    		@RequestParam String department, 
    		@RequestParam String location,
    		Model IModel)  {
    	
    	String apiName = ToolRestApi.checkWord(name);
    	String apiSurname = ToolRestApi.checkWord(surname);
    	
    	name = !apiName.isEmpty() ? apiName : name;
    	surname = !apiSurname.isEmpty() ? apiSurname : surname;
    	    	
		UserImpl user = (UserImpl) userServices.register(name, surname, department, location);
    	
	    IModel.addAttribute(TemplatesConstants.EMAIL, user.getEmail());    	
    	return "register";
    }


}
