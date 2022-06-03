package com.bl.employeepayroll.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bl.employeepayroll.dao.EmployeeDao;
import com.bl.employeepayroll.dto.EmployeeDto;
import com.bl.employeepayroll.model.Employee;

@Service
public class EmployeeImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public String addEmployee(EmployeeDto employeeDto) {
		Employee employee = modelMapper.map(employeeDto, Employee.class);
		employeeDao.save(employee);
		return "employee added successfully";
	}

	@Override
	public List<Employee> getEmployee() {
		return employeeDao.findAll();
	}

}
