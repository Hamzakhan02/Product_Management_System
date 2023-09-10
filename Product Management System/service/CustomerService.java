package com.store.service;

import com.store.dao.CustomerDao;
import com.store.dto.Customer;

public class CustomerService {
	
	CustomerDao customerDao=new CustomerDao();
	
	public boolean deleteCustomer(int id) {
		  boolean i = customerDao.deleteCustomer(id);
		  return i;
		
	}
	
//	
	
	public String updateCustomer(int id,String email) {
		         String n = customerDao.updateCustomer(id,email);
		                return n;
		
	}
	
//	
	
	
	public int getCustomer(int id) {
		int n= customerDao.getCustomer(id);
		return n;
	}
//	
	
	 public void getAllCustomer(){
		 customerDao.getAllCustomer();
	 }
	
	
//	
	
	public Customer saveCustomer(Customer customer) {
			  
		      return customerDao.saveCustomer(customer);
		
	}

}
