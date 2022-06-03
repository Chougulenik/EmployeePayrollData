package com.bl.employeepayroll.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bl.employeepayroll.dao.DepartmentDao;
import com.bl.employeepayroll.model.Department;

@Service
public class DepartmentImpl implements DepartmentService {
	
	@Autowired
	private DepartmentDao departmentDao;

	@Override
	public List<Department> getDepartment() {
		return null;
	}

}
