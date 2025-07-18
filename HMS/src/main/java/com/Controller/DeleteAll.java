package com.Controller;

import java.sql.SQLException;

import com.DAO.PatientDao;
import com.DTO.Patient;

public class DeleteAll 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Patient patient = new Patient();
		
		PatientDao dao=new PatientDao();
		dao.Delete(patient);
	}

}
