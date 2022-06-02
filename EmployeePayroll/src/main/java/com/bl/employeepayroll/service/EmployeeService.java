package com.bl.employeepayroll.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bl.employeepayroll.model.Employee;

public interface EmployeeService {

	public List<Employee> getEmployee();
	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public Employee deleteEmployee(int id);
	
}
