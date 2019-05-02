package com.restsample.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/employee")
public class EmployeeController {
	
	
	@RequestMapping(value = "/sayhello", method = RequestMethod.GET) 
	public String sayHello() {
		return "Hello From Employee";
	}
	

}
