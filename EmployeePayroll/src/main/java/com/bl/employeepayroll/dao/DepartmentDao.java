package com.bl.employeepayroll.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bl.employeepayroll.model.Department;

public interface DepartmentDao extends JpaRepository<Department, Integer>{

}
