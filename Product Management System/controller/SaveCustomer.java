package com.store.controller;

import java.util.Scanner;

import com.store.dto.Customer;
import com.store.dto.Product;
import com.store.service.CustomerService;

public class SaveCustomer { 
	public static void main(String[] args) {
		
		CustomerService customerservice =new CustomerService();
		
		Customer customer=new Customer();
		System.out.println("Enter Id");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		customer.setId(a);
//		
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Name");
		String b=sc1.nextLine();
		customer.setName(b);
//		
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter Email");
		String c=sc2.nextLine();
		customer.setEmail(c);
		
		
		
		
		
		
		Customer p= customerservice.saveCustomer(customer);
		if(p!=null) {
			System.out.println(p.getName()+" Saved success "+p.getId());
		}
		
		
		

		
		 
	}

}
