package com.Controller;

import com.DAO.PatientDao;
import com.DTO.Patient;

public class Display 
{
	public static void main(String[] args) 
	{
		Patient patient=new Patient();
		
		PatientDao dao=new PatientDao();
		dao.display(patient);
		
	}

}
