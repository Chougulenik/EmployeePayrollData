package com.bl.employeepayroll.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bl.employeepayroll.model.Employee;
import com.bl.employeepayroll.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	public EmployeeService employeeService;
	
	@PostMapping("/user")
	public Employee addEmployee(@RequestBody Employee employee) {
		return this.employeeService.addEmployee(employee);	
	}
	
	@GetMapping("/user")
	public List<Employee> getEmployee() {
		return this.employeeService.getEmployee();
	}
	
	@PutMapping("/user")
	public Employee updateEmployee(@RequestBody Employee employee) {
		 return this.employeeService.updateEmployee(employee);
	}	
}
