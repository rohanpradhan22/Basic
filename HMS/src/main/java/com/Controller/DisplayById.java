package com.Controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.DAO.PatientDao;
import com.DTO.Patient;

public class DisplayById 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Patient patient=new Patient();
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter id ");
		patient.setP_id(scanner.nextInt());
		
		PatientDao dao=new PatientDao();
		dao.displayById(patient);
		
	}

}

