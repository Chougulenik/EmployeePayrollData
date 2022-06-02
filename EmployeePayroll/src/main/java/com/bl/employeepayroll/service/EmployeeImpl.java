package com.bl.employeepayroll.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bl.employeepayroll.dao.EmployeeDao;
import com.bl.employeepayroll.model.Employee;

@Service
public class EmployeeImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public Employee addEmployee(Employee emplyee) {
		return employeeDao.save(emplyee);
	}

	@Override
	public List<Employee> getEmployee() {
		return employeeDao.findAll();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeDao.save(employee);
	}

	@Override
	public Employee deleteEmployee(int id) {
		Employee emp = employeeDao.findById(id).get();	
		employeeDao.delete(emp);
		return emp;
	}

}
