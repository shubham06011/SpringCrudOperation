package com.springboot.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.demo.entity.Employee;
import com.springboot.demo.repository.EmployeeRepository;
import com.springboot.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	public Employee saveEmployee(Employee employee) {
		return repository.save(employee);
	}

	@Override
	public Employee getEmployeeById(int id) {
		Employee emp = repository.findByEmpId(id);
		return emp;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> empList = (List<Employee>) repository.findAll();
		return empList;
	}

	@Override
	public void deleteEmpById(int id) {
		repository.deleteById(id);

	}

	@Override
	public List<Employee> getEmployeeByname(String name) {
		List<Employee> empList = repository.getEmployeeByName(name);
		 return empList;
	}

}
