package com.bl.employeepayroll.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bl.employeepayroll.model.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
