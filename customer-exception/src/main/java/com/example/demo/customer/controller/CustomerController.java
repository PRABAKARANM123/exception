package com.example.demo.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.customer.service.CustomerService;
import com.example.demo.entity.Customer;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
// Get Customer By Id	
	@GetMapping("/getCustomer/{id}")
	public Customer getCustomer(@PathVariable int id) {
		return customerService.getCustomer(id);
		
	}
	
// Add New Customer
	@PostMapping("/addCustomer")
	public String addCustomer(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);
		
		
	}
	
// Update Customer Details
	@PutMapping("/updateCustomer")
	public String updateCustomer(@RequestBody Customer customer) {
		return customerService.updateCustomer(customer);
		
		
	}

}
