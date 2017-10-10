package com.cg.student.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.student.bean.StudentScoreBean;

public interface IStudentService {

	public ArrayList<Integer> getDetails() throws SQLException;

	public int addStudentDetails(StudentScoreBean bean);

	public int total(int l,int m,int c);
	
	public String grade(int total);
	

}
