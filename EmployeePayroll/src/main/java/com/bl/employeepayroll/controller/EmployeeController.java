package com.bl.employeepayroll.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bl.employeepayroll.dto.EmployeeDto;
import com.bl.employeepayroll.model.Employee;
import com.bl.employeepayroll.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	public EmployeeService employeeService;
	
	@PostMapping("/register")
	public ResponseEntity<String> addEmployee(@RequestBody EmployeeDto employeeDto) {
		String message = employeeService.addEmployee(employeeDto);
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}
	
	@GetMapping("/user")
	public List<Employee> getEmployee() {
		return this.employeeService.getEmployee();
	}
	
}
