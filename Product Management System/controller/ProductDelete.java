package com.store.controller;

import com.store.service.ProductService;

public class ProductDelete {
	public static void main(String[] args) {
		ProductService productService=new ProductService();
		boolean res= productService.deleteProduct(3);
		System.out.println(res+" SuccessFully Deleted");
		
	}

}
