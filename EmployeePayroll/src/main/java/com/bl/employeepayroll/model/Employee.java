package com.bl.employeepayroll.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GeneratorType;

import lombok.Data;

@Entity
@Data
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String profileImage;
	private String gender;
	
	@OneToMany(targetEntity = Department.class, cascade = CascadeType.ALL)
	private List<Department> department;
	private int salary;
	private LocalDate startDate;
	private String note;
	

}
