package com.springrest.springrest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.DepartmentDAO;
import com.springrest.springrest.dao.MyDAO;
import com.springrest.springrest.entities.Department;
import com.springrest.springrest.entities.Employee;

@Service
public class MyService {

		@Autowired
		private MyDAO employeeDao;
		@Autowired
		private DepartmentDAO departmentDao;
	
		//add employee
		public Employee addEmployee(Employee emp) {
			return employeeDao.save(emp);
		}
		
		// get all employee
		public List<Employee> getAllEmployee() {
			return employeeDao.findAll();
		}
		
		// get employee by id
		public Optional<Employee> getEmpById(int id) {
			return employeeDao.findById(id);
		}
		
		//update employee
		public Employee updateEmp(Employee emp) {
			return employeeDao.save(emp);
		}
		
		// delete employee
		public void deleteEmp(int id) {
			//Employee e = employeeDao.getOne(id);
			//employeeDao.delete(e);
			employeeDao.deleteById(id);
		}

		public List<Department> getAllDepartments() {
			return departmentDao.findAll();
		}

		public Department addDepartment(Department dept) {
			return departmentDao.save(dept);
		}

		public Optional<Department> getDeptById(int id) {
			return departmentDao.findById(id);
		}
	
		public Department updateDepartment(Department dept) {
			return departmentDao.save(dept);
		}
}
