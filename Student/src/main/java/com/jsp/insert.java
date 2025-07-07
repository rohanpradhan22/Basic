package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insert
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection  connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root","Rohan@22");
		
		Statement statement=connection.createStatement();
		
		boolean s1=statement.execute("insert into std values(2,'Sohan','UP')");
		
		System.out.println(s1);
		
		statement.close();
		connection.close();
	}

}
