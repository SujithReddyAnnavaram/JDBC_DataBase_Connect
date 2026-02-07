package com.jdbc.connect;

import java.sql.*;

public class JdbcDataBase {
	
	static Connection connect ;
	static Statement statement;
	
	static int noOfRowsEffected;
	
	static String url="jdbc:mysql://localhost:3306/jdbclearning";
	static String user="root";
	static String password="jdbcjdbc";
	
	public static void main(String []args) {	
		
		
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		 connect = DriverManager.getConnection(url,user,password);
		
	     // statement = connect.createStatement();
		 
		 PreparedStatement statement=connect.prepareStatement(mainClass.querry());
		
		 statement.setInt(1,22);
		 statement.setString(2,"Telangana");
		 statement.setString(3,"mahesh");
		   
		  noOfRowsEffected= statement.executeUpdate();
		  
		  mainClass.results();
		
		}catch(SQLException sql) {
			
			sql.printStackTrace();
			
		}catch(Exception e) {
			
			System.out.println("Exception occured");
		}
		finally{
			try {
				
			     connect.close();
			}catch(SQLException e) {
				System.out.println("Exception Occured at Finnally Bloack");
				
			}
		}
	

	}

}
