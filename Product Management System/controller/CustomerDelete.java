package com.store.controller;

import com.store.service.CustomerService;

public class CustomerDelete {
	public static void main(String[] args) {
		CustomerService customerService=new CustomerService();
		boolean a = customerService.deleteCustomer(2);
		System.out.println(a+" SuccessFully Deleted");
	}

}
