package com.springang.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springang.model.Employee;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class XMLController
{
	@RequestMapping(value = "/getxmlEmployee", method = RequestMethod.GET)
	public Employee getEmployeeInfo()
	{
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Peter");
		employee.setAge(34);
		employee.setSalary(30000);
		return employee;
	}
}