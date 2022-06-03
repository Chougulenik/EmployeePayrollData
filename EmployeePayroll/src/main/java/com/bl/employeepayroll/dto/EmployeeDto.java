package com.bl.employeepayroll.dto;

import java.time.LocalDate;
import java.util.List;

import com.bl.employeepayroll.model.Department;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class EmployeeDto {
	
	private String name;
	private String profileImage;
	private List<Department> department;
	private String gender;
	private int salary;
	private LocalDate startDate;
	private String note;
}
