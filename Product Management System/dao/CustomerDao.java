package com.store.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.store.configuration.HelperClass;
import com.store.dto.Customer;

public class CustomerDao{
     
	HelperClass helperClass=new HelperClass();
	
	Connection connection=null;
	
	public Customer saveCustomer(Customer customer) {
		
	   connection =	helperClass.getConnection();
		String sql="INSERT INTO customer values(?,?,?)";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			preparedStatement.setInt(1,customer.getId());
			preparedStatement.setString(2,customer.getName());
			preparedStatement.setString(3,customer.getEmail());
			
			preparedStatement.execute();
			
			
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
		} return customer;

	}
	
//	delete
	
	public boolean deleteCustomer(int id) {
		connection= helperClass.getConnection();
		
		String sql="DELETE FROM customer WHERE id=?";
		
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
	
	//Update
	
	public String updateCustomer(int id,String email){
        connection=helperClass.getConnection();
        
        String sql="UPDATE customer SET email=? WHERE id=?";
        
        
        
        try {
			 PreparedStatement preparedStatement =connection.prepareStatement(sql);
			 
			 preparedStatement.setString(1,email);
			 preparedStatement.setInt(2,id);
			 
			 
			 
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
			return email;
		}
       }
	
	//get single
	
	 public int getCustomer(int id) {
		 connection  =helperClass.getConnection();
		 String sql="SELECT * FROM customer WHERE ID=? ";
		 
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
	 
	 //get all
	 
	 public void getAllCustomer(){
		   connection= helperClass.getConnection();
		   String sql="SELECT * FROM customer";
		   
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
