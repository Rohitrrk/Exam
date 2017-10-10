package com.cg.student.dao;

import java.sql.SQLException;
import java.util.ArrayList;


import com.cg.student.bean.StudentScoreBean;



public interface IStudentDao {

	public ArrayList<Integer> getDetails() throws SQLException;

	public int addStudentDetails(StudentScoreBean bean);

	

}
