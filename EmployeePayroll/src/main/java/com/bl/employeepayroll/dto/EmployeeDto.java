package com.bl.employeepayroll.dto;

import lombok.Data;

@Data
public class EmployeeDto {
	
	private int id;
	private String name;
	private String gender;
	private int salary;
	private int startDay;
	private int month;
	private int year;
	private String note;
}
