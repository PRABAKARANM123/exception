package com.example.demo.customer.service;

import com.example.demo.entity.Customer;

public interface CustomerService {
	
	Customer getCustomer(Integer id);
	String addCustomer(Customer customer);
	String updateCustomer(Customer customer);

}
