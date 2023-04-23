package com.springboot.demo.service;

import java.util.List;

import com.springboot.demo.entity.Employee;

public interface EmployeeService {
	
	
	public Employee saveEmployee(Employee employee);
	
	public Employee getEmployeeById(int id);

	public List<Employee> getAllEmployees();
	
	public void deleteEmpById(int id);
	
	public List<Employee> getEmployeeByname(String name);
}
