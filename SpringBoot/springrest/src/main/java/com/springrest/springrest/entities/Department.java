package com.springrest.springrest.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Department_Foram1")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int deptId;
	private String deptName;
	
	/*
	 * @OneToMany(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "deptId") private List<Employee> employees;
	 */

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	/*
	 * public List<Employee> getEmployees() { return employees; }
	 * 
	 * public void setEmployees(List<Employee> employees) { this.employees =
	 * employees; }
	 */
	/*
	 * @Override public String toString() { return "Department [deptId=" + deptId +
	 * ", deptName=" + deptName + ", employees=" + employees + "]"; }
	 */

	public Department(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
	}

	public Department(int deptId) {
		super();
		this.deptId = deptId;
	}

	public Department() {}
}
