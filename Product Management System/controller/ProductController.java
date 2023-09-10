package com.store.controller;

import com.store.dto.Product;
import com.store.service.ProductService;

public class ProductController {
	
	public static void main(String[] args) {
		
		Product product=new Product();
		
		product.setId(2);
		product.setName("Normal");
		
		product.setBrand("Lenovo");
		product.setPrice(28000);
		
		ProductService productService= new ProductService();
		Product p= productService.saveProduct(product);
		
		if(p!=null) {
			System.out.println(p.getId()+" Saved success");
		}
		
	}

}
