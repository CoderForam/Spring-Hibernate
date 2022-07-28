package com.springrest.springrest.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Employee_Foram1")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private Long salary;
	private Integer totalExperience;
	private String designation;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "deptId")
	private Department dept;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	
	public Integer getTotalExperience() {
		return totalExperience;
	}
	public void setTotalExperience(Integer totalExperience) {
		this.totalExperience = totalExperience;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	public Employee(int id, String name, Long salary, Integer totalExperience, String designation, Department dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.totalExperience = totalExperience;
		this.designation = designation;
		this.dept = dept;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", totalExperience=" + totalExperience
				+ ", designation=" + designation + ", dept=" + dept + "]";
	}
	
	
}
