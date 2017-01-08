package com.mar1;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.hibernate.jpa.criteria.expression.SearchedCaseExpression.WhenClause;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.matchers.NotNull;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mar1.model.Employee;
import com.mar1.repository.EmployeeRepository;
import com.mar1.service.EmployeeService;
import com.mar1.service.EmployeeServiceImpl;



@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeServiceTest {
	
	@Mock
	private EmployeeRepository employeeRepository;
	
	@InjectMocks
	private EmployeeServiceImpl employeeService;
	
	
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
	}
	
	
	@Test
	public void testGetAllEmployees(){
		List<Employee> result = employeeRepository.findAll();
		when(employeeService.getAllEmplyees()).thenReturn(result);
		System.out.println(result);
	}
	
	@Test
	public void testGetEmployeeById(){
		Employee employee = employeeRepository.findOne(1L);
		Employee employee2 = employeeService.getEmployeeById(1);
		assertEquals(employee.getId(), employee2.getId());
		
	}

}
