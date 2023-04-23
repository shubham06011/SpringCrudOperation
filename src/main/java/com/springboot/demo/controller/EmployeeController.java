package com.springboot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.entity.Employee;
import com.springboot.demo.service.EmployeeService;
import com.springboot.demo.serviceimpl.EmployeeServiceImpl;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/save")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		Employee emp = employeeService.saveEmployee(employee);
		return ResponseEntity.ok().body(emp);
	}

	@GetMapping("/getEmpById/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		Employee emp = employeeService.getEmployeeById(id);
		return emp;
	}

	@GetMapping("/getAllEmp")
	public List<Employee> getAllEmployees() {
		List<Employee> empList = employeeService.getAllEmployees();
		return empList;
	}
	
	@DeleteMapping("/deleteById/{id}")
	public void deleteById(@PathVariable int id) {
		employeeService.deleteEmpById(id);
	}
	
	@GetMapping("/getEmpByName/{name}")
	public List<Employee> getEmployeesByName(@PathVariable String name){
		 List<Employee> empList=employeeService.getEmployeeByname(name);
		 return empList;
	}

}
