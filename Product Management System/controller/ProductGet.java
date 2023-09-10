package com.store.controller;

import com.store.service.ProductService;

public class ProductGet {
	public static void main(String[] args) {
		ProductService productService=new ProductService();
		
		int a= productService.getPrice(4);
//		System.out.println(a);
	}

}
