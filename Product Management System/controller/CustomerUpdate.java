package com.store.controller;

import com.store.dto.Customer;
import com.store.service.CustomerService;

public class CustomerUpdate {
	
	public static void main(String[] args) {
		
		CustomerService customerService=new CustomerService();
//		Customer customer = new Customer();
		String s=customerService.updateCustomer(3,"awaaa@aaa");
		System.out.print(s);
	}

}
