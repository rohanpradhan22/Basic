package com.Controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.DAO.PatientDao;
import com.DTO.Patient;

public class Update {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Patient patient=new Patient();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("UPDATE DATA");
		
		System.out.println("NAME");
		patient.setName(scanner.nextLine());
		
		System.out.println("Addresss");
		patient.setAddress(scanner.nextLine());
		
		System.out.println("Phone");
		patient.setPhone(scanner.nextLong());
		
		System.out.println("Doctor");
		scanner.nextLine();
		patient.setDoctor(scanner.nextLine());
		
		
		System.out.println("P_id");
		patient.setP_id(scanner.nextInt());
		
	PatientDao dao=new PatientDao();
	dao.Update(patient);
		
		
		// TODO Auto-generated method stub

	}

}
