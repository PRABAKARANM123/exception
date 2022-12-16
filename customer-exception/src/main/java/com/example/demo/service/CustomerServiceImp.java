package com.example.demo.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.customer.alreadtexist.exception.CustomerAlreadyExistsException;
import com.example.demo.customer.service.CustomerService;
import com.example.demo.entity.Customer;
import com.example.demo.nosuch.customer.exist.exception.NoSuchCustomerExistsException;
import com.example.demo.repository.CustomerRepo;
@Service
public class CustomerServiceImp implements CustomerService{
	@Autowired
	private CustomerRepo customerRepo;
	
	
	public Customer getCustomer(Integer id) {
		
		return customerRepo.findById(id).orElseThrow(
				()-> new NoSuchElementException("No Customer present With Id :"+id)
				);
	}

	@Override
	public String addCustomer(Customer customer) {
	Customer existingCustomer = customerRepo.findById(customer.getId()).orElse(null);
	if(existingCustomer==null) {
		customerRepo.save(customer);
		return "Customer Added Succesfully";
	}
	else {
		throw new CustomerAlreadyExistsException("Customer already exist");
	}
	}

	@Override
	public String updateCustomer(Customer customer) {
		Customer existingCustomer = customerRepo.findById(customer.getId()).orElse(null);
		if(existingCustomer==null)throw new NoSuchCustomerExistsException("No such Customer exception");
		else {
			existingCustomer.setName(customer.getName());
			existingCustomer.setAddress(customer.getAddress());
			customerRepo.save(existingCustomer);
			return "Record Update Succesfully";
		}
	}

}
