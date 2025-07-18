package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.DTO.Patient;
import com.mysql.cj.jdbc.Driver;

public class PatientDao 
{
	static String url="jdbc:mysql://localhost:3306/advjava";
	static String un="root";
	static String pass="Rohan@22";
	
	public void Insert(Patient p)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection(url, un, pass);
			
			PreparedStatement preparedStatement=connection.prepareStatement("Insert into hms values(?,?,?,?,?)");
			
			preparedStatement.setInt(1, p.getP_id());
			preparedStatement.setString(2, p.getName());
			preparedStatement.setString(3, p.getAddress());
			preparedStatement.setLong(4, p.getPhone());
			preparedStatement.setString(5, p.getDoctor());
			
			boolean b= preparedStatement.execute();
			if(b=true) {
				System.out.println("***DATA ADDED***");
			}
			else {
				System.out.println("***ERROR***");
			}

			preparedStatement.close();
			connection.close();
			
			
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	public void Update(Patient p) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection(url, un, pass);
		
		PreparedStatement preparedStatement=connection.prepareStatement("update hms set Name=?,Address=?,Phone=?,Doctor=? where idHMS=?");
		
		preparedStatement.setString(1, p.getName());
		preparedStatement.setString(2, p.getAddress());
		preparedStatement.setLong(3, p.getPhone());
		preparedStatement.setString(4, p.getDoctor());
		preparedStatement.setInt(5, p.getP_id());
		
		int x = preparedStatement.executeUpdate();
		System.out.println(x);
		if(x == 1)
		{
			System.out.println("***DATA UPDATED***");
		}
		else {
			System.out.println("***ERROR***");
		}
		
		preparedStatement.close();
		connection.close();
		
		
	}
	
	public void display(Patient p)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection(url, un, pass);
			
			PreparedStatement preparedStatement=connection.prepareStatement("Select * from hms");
			
			ResultSet resultSet= preparedStatement.executeQuery();
			
			while(resultSet.next()) 
			{
				System.out.println("P_id "+resultSet.getInt(1));
				System.out.println("Name "+resultSet.getString(2));
				System.out.println("Address "+resultSet.getString(3));
				System.out.println("Phone "+resultSet.getLong(4));
				System.out.println("Doctor "+resultSet.getString(5));
				System.out.println();
				
			}
			
			preparedStatement.close();
			connection.close();
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void displayById(Patient p) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection(url, un, pass);
		
		PreparedStatement preparedStatement=connection.prepareStatement("select * from hms where idHMS=?");
		
		preparedStatement.setInt(1, p.getP_id());
		
	    ResultSet resultSet=preparedStatement.executeQuery();
		
		while(resultSet.next()) 
		{
			System.out.println("P_id "+resultSet.getInt(1));
			System.out.println("Name "+resultSet.getString(2));
			System.out.println("Address "+resultSet.getString(3));
			System.out.println("Phone "+resultSet.getLong(4));
			System.out.println("Doctor "+resultSet.getString(5));
			System.out.println();
			
		}
		
		preparedStatement.close();
		connection.close();
		
		
	}
	public void deletebyid(Patient p) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection(url, un, pass);
		
		PreparedStatement preparedStatement=connection.prepareStatement("Delete from hms where idHMS =?");
		
		preparedStatement.setInt(1, p.getP_id());
		
		 preparedStatement.executeLargeUpdate();
		
		System.out.println("Data is deleted");
		
		preparedStatement.close();
		connection.close();
		
	}
	public void Delete(Patient p) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection(url, un, pass);
		
		PreparedStatement preparedStatement=connection.prepareStatement("Delete from hms");
		
		preparedStatement.executeUpdate();
		
		System.out.println("Data deleted");
		
		preparedStatement.close();
		connection.close();
		
		
	}
	

}
