package com.bl.employeepayroll.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bl.employeepayroll.dto.EmployeeDto;
import com.bl.employeepayroll.model.Employee;

public interface EmployeeService {

	public List<Employee> getEmployee();
	public String addEmployee(EmployeeDto employeeDto);
	
}
