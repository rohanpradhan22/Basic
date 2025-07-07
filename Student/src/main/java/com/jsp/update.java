package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class update 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "Rohan@22");
	
		Statement statement=connection.createStatement();
		
		int x=statement.executeUpdate("update std set Ards='darjeeling' where id =2");
		
		System.out.println(x);
		
		statement.close();
		connection.close();
	}

}
