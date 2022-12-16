package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Employee;
import com.example.demo.exception.EmployeeNotFoundException;
import com.example.demo.repository.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepo empRepo;
	
//	public Employee getById(int id) {
//		Employee employee = empRepo.findById(id).get();
//		return  employee;
//		
//	}
	
	public Employee getById(int id) {
		Employee employee = empRepo.findById(id).orElseThrow(()-> new EmployeeNotFoundException("NO EMPLOYEE PRESENT WITH ID :"+id));
		return  employee;
		
	}

}
