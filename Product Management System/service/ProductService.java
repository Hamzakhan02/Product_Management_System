package com.store.service;

import com.store.dao.ProductDao;
import com.store.dto.Product;

public class ProductService {
    
	
	ProductDao productDao=new ProductDao();
	
	public Product saveProduct(Product product) {
		return  productDao.saveProduct(product);
	}
	
	//delete
	public boolean deleteProduct(int id) {
		boolean d= productDao.deleteProduct(id);
		return d;
	}
	
	public double updateProduct(double price,int id) {
			double p = productDao.updateProduct(price,id);
			return p;
		}
	
	public int getPrice(int id) {
		int a= productDao.getPrice(id);
		return a;
	}
	
	 public void getAllProducts(){
		  productDao.getAllProducts();
		
	 }
	
	
	
}
