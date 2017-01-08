package com.mar1.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mar1.model.Employee;
import com.mar1.service.EmployeeService;

@RestController
public class EmployeeRestController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(path="/employees", method=RequestMethod.GET)
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmplyees();
	}
	
	@RequestMapping(path="/employee/{is}", method=RequestMethod.GET)
	public Employee getEmployeeById(@PathVariable("id") int id){
		return employeeService.getEmployeeById(id);
	}
	
	
}
