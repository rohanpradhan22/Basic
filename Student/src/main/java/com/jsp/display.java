package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class display 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "Rohan@22");
		
		Statement statement=connection.createStatement();
		
		ResultSet resultSet=statement.executeQuery("Select * from std");
		
		while(resultSet.next())
		{
			System.out.println("id:-"+resultSet.getInt(1));
			System.out.println("Name;-"+resultSet.getString(2));
			System.out.println("Adrs:-"+resultSet.getString(3));
			System.out.println();
		}
		statement.close();
		connection.close();
	}

}
