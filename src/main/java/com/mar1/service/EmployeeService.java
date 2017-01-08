package com.mar1.service;

import java.util.List;

import com.mar1.model.Employee;

public interface EmployeeService {
	public List<Employee> getAllEmplyees();
	public Employee getEmployeeById(long id);
}
