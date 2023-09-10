package com.store.controller;


import java.util.Scanner;

import com.store.dto.Product;
import com.store.service.ProductService;


public class ProductUpdate {
	public static void main(String[] args) {
		ProductService productService= new ProductService();
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter ID");
		
		int n=sc.nextInt();
		
//		Scanner c=new Scanner(System.in);
//		System.out.println(" Enter Price ot be update");
//		
//		double t=c.nextDouble();
//	
		
		
		
		
		double s = productService.updateProduct(n,5000);
		System.out.println(s+" Successfully Update");
		
		
		
		
		
	}

}
