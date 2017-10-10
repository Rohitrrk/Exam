package com.cg.student.bean;

public class StudentBean {
	
	private int studentId;
	private String subjectName;
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public StudentBean(int studentId) {
		super();
		this.studentId = studentId;
	}
	public StudentBean() {
		// TODO Auto-generated constructor stub
	}
	
	


}
