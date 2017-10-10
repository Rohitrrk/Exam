package com.cg.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.cg.student.bean.StudentScoreBean;
import com.cg.student.dbutil.DbUtil;


public class StudentDaoImpl implements IStudentDao {

	Connection conn = null;
	int row;
	@Override
	public ArrayList<Integer> getDetails() throws SQLException {

		conn = DbUtil.getConnection();
		ArrayList<Integer> list = new  ArrayList<Integer>();
		 
		String sql = "Select student_id from Student";
		
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next())
		{
			int id = rs.getInt(1);
			list.add(id);
		}
		return list;
	}
	
	
	
	@Override
	public int addStudentDetails(StudentScoreBean bean) {
	
		try {
		conn = DbUtil.getConnection();
		
		String insert = "INSERT INTO StudentScoretable VALUES(?,?,?,?,?,?,?)";
		PreparedStatement pst = conn.prepareStatement(insert);
	
		
		pst.setInt(1, bean.getStudentId());
		pst.setString(2, bean.getSubjectName());
		pst.setInt(3, bean.getTheory());
		pst.setInt(4, bean.getMcq());
		pst.setInt(5, bean.getLab());
		pst.setInt(6, bean.getTotal());
		pst.setString(7, bean.getGrade());
		
		row = pst.executeUpdate();
			
		
		}
		
		catch (SQLException e) {
			
		
			e.printStackTrace();
		}
		
		return row;
	}











		
	

}
