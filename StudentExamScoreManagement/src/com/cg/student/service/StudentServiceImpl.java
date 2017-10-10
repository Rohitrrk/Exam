package com.cg.student.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.student.bean.StudentScoreBean;
import com.cg.student.dao.IStudentDao;
import com.cg.student.dao.StudentDaoImpl;


public class StudentServiceImpl implements IStudentService {

	IStudentDao dao = new StudentDaoImpl();
	
	@Override
	public ArrayList<Integer> getDetails() throws SQLException {
		
		return dao.getDetails();
	}

	@Override
	public int addStudentDetails(StudentScoreBean bean)
	{
		
		return dao.addStudentDetails(bean);
	}


	public int total(int l, int m, int c) {
		int total=(l+m+c);
		return total;
	}


	public String grade(int total) {
		String grade;

		if(total >= 91 && total <=100)
		{
			grade = "S";
		}
		else if(total >= 81 && total <=90)
		{
			grade = "A";
		}
		
		else if(total >= 71 && total <=80)
		{
			grade = "B";
		}
		
		else if(total >= 61 && total <=70)
		{
			grade = "C";
		}
		
		else if(total >= 50 && total <=60)
		{
			grade = "D";
		}		
		
		
		else 
		{
			grade = "U";
		}
		return grade;
	}







}
