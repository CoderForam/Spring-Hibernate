package com.springrest.springrest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Department;
import com.springrest.springrest.entities.Employee;
import com.springrest.springrest.service.MyService;

@RestController
public class MyController {

	@Autowired
	private MyService myService; 
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return myService.getAllEmployee();
	}
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee emp) {
		return myService.addEmployee(emp);
	}
	
	@GetMapping("/employee/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable String id) {
		return myService.getEmpById(Integer.parseInt(id));
	}
	
	@PutMapping("/employees") 
	public Employee updateEmployee(@RequestBody Employee emp) {
		return myService.updateEmp(emp);
	}
	
	@DeleteMapping("/employee/{id}")
	public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable String id) {
		try {
			myService.deleteEmp(Integer.parseInt(id));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@GetMapping("/departments")
	public List<Department> getAllDepartments() {
		return myService.getAllDepartments();
	}
	
	@PostMapping("/departments")
	public Department addDepartment(@RequestBody Department dept) {
		return myService.addDepartment(dept);
	}
	
	@GetMapping("/department/{id}")
	public Optional<Department> getDepartmentById(@PathVariable String id) {
		return myService.getDeptById(Integer.parseInt(id));
	}
	
	@PutMapping("/departments")
	public Department updateDepartment(@RequestBody Department dept) {
		return myService.updateDepartment(dept);
	}
}
