package com.store.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;
import com.store.configuration.HelperClass;
import com.store.dto.Product;

public class ProductDao {
	HelperClass helperClass=new HelperClass();
	
	Connection connection=null;
	//save product method
	public Product saveProduct(Product product) {
		
			connection=helperClass.getConnection();
			
			String sql="INSERT INTO product VALUES(?,?,?,?)";
			//create connection
			try {
				PreparedStatement  preparedStatement= connection.prepareStatement(sql);
				
				preparedStatement.setInt(1, product.getId());
				preparedStatement.setString(2, product.getName());
				preparedStatement.setString(4, product.getBrand());
				preparedStatement.setDouble(3, product.getPrice());
				
				preparedStatement.execute();
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return product;
			}
		
	}
	
	//deleteproduct
	
	public boolean deleteProduct(int id) {
		connection= helperClass.getConnection();
		
		String sql="DELETE FROM product WHERE id=?";
		
		try {
			     PreparedStatement preparedStatement=connection.prepareStatement(sql);
			      
			     preparedStatement.setInt(1, id);
			     
			   int  i = preparedStatement.executeUpdate();
			   if(i<0) {
				   return false;
			   }
			     
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return true;
		
	}
	
	//UPDATE
	
	public double updateProduct(double price,int id) {
		            connection=helperClass.getConnection();
		            
		            String sql="UPDATE product SET price=? WHERE id=?";
		            
		            
		            
		            try {
						 PreparedStatement preparedStatement =connection.prepareStatement(sql);
						 
						 preparedStatement.setInt(1, id);
						 preparedStatement.setDouble(2,price);
						 
						 
						 preparedStatement.executeUpdate();
						
						 
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally {
						try {
							connection.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						return price;
					}
		           }
	
	//get 
	
	 public int getPrice(int id) {
		 connection  =helperClass.getConnection();
		 String sql="SELECT * FROM product WHERE ID=? ";
		 
		  try {
			PreparedStatement preparedStatement= connection.prepareStatement(sql);
			 
			
			
			preparedStatement.setInt(1,id);
			
			ResultSet resultset=preparedStatement.executeQuery();
			while(resultset.next()) {
				  System.out.println(resultset.getInt(1));
				   System.out.println(resultset.getString(2));
				   System.out.println(resultset.getString(3));
				   System.out.println("================================");
			   
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return id;

	   }
	 }
	 
	 //Get All
	 public void getAllProducts(){
		   connection= helperClass.getConnection();
		   String sql="SELECT * FROM product";
		   
		   try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			
			
			
			ResultSet resultset=preparedStatement.executeQuery();
			while(resultset.next()) {
				System.out.println(resultset.getInt(1));
				   System.out.println(resultset.getString(2));
				   System.out.println(resultset.getString(3));
				   System.out.println("================================");
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		   
		   
	 }
	
	

}
