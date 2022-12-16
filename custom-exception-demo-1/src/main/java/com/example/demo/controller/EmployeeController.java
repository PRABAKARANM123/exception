package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.exception.EmployeeNotFoundException;
import com.example.demo.exception.ErrorObject;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	@GetMapping("/employee/{id}")
	public Employee getById(@PathVariable int id) {
		
		return empService.getById(id);
	}
	
	@ExceptionHandler(value= EmployeeNotFoundException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	public ErrorObject
	handleCustomerAlreadyExistsException(
		EmployeeNotFoundException ex)
	{
		return new ErrorObject(HttpStatus.CONFLICT.value(),
                       ex.getMessage());
	}
	
}