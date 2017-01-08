package com.mar1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class EmployeeController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String goHome(){
		return "index";
	}
}
