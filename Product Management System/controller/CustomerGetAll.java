package com.store.controller;

import com.store.service.CustomerService;

public class CustomerGetAll {
	
	public static void main(String[] args) {
		CustomerService customerService=new CustomerService();
		customerService.getAllCustomer();
	}

}
