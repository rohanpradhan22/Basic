package com.Controller;

import java.util.Scanner;

import com.DAO.PatientDao;
import com.DTO.Patient;

public class Insert {

	public static void main(String[] args) {
		
		Patient patient=new Patient();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("***Patient Details***");
		System.out.println("Enter P_id");
		patient.setP_id(scanner.nextInt());
		
		System.out.println("Enter Name");
		scanner.nextLine();
		patient.setName(scanner.next());
		scanner.next();
		
		System.out.println("Enter Address");
		patient.setAddress(scanner.next());
		scanner.nextLine();

		System.out.println("Enter Phone");
		patient.setPhone(scanner.nextLong());
		scanner.nextLine();
		
		System.out.println("Enter Docter");
		patient.setDoctor(scanner.nextLine());
		
		PatientDao dao=new PatientDao();
		dao.Insert(patient);

	}

}
