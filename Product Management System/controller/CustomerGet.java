package com.store.controller;

import com.store.service.CustomerService;

public class CustomerGet {
	public static void main(String[] args) {
		CustomerService customerService=new CustomerService();
	  int	s = customerService.getCustomer(4);
	}

}
