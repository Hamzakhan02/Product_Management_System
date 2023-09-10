package com.store.controller;

import com.store.service.ProductService;

public class ProductGetAll {
	public static void main(String[] args) {
		 ProductService productService=new ProductService();
		  productService.getAllProducts();
		  
	}

}
