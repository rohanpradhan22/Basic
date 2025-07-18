package com.Controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.DAO.PatientDao;
import com.DTO.Patient;

public class DeleteById 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Patient patient=new Patient();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter id u want to delete");
		patient.setP_id(scanner.nextInt());
		
		PatientDao dao=new PatientDao();
		dao.deletebyid(patient);
		
	}

}
