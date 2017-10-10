package com.cg.student.bean;

public class StudentScoreBean {

	private int studentId;
	private String subjectName;
	private int theory;
	private int mcq;
	private int lab;
	private int total;
	private String grade;
	
	
	public int getTotal() {
		return total;
	}
	public StudentScoreBean(int studentId, String subjectName, int total,
			String grade) {
		super();
		this.studentId = studentId;
		this.subjectName = subjectName;
		this.total = total;
		this.grade = grade;
	}
	public void setTotal(int total) {
		this.total = total;
	}


	
	
	
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
	public int getTheory() {
		return theory;
	}
	public void setTheory(int theory) {
		this.theory = theory;
	}
	public int getMcq() {
		return mcq;
	}
	public void setMcq(int mcq) {
		this.mcq = mcq;
	}
	public int getLab() {
		return lab;
	}
	public void setLab(int lab) {
		this.lab = lab;
	}
	
	
	
	public StudentScoreBean()
	{
		super();
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public StudentScoreBean(int studentId, String subjectName, int theory,
			int mcq, int lab, int total, String grade) {
		super();
		this.studentId = studentId;
		this.subjectName = subjectName;
		this.theory = theory;
		this.mcq = mcq;
		this.lab = lab;
		this.total = total;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "StudentScoreBean [studentId=" + studentId + ", subjectName="
				+ subjectName + ", theory=" + theory + ", mcq=" + mcq
				+ ", lab=" + lab + ", total=" + total + ", grade=" + grade
				+ "]";
	}
	
	

	
	
	
	
	
	
	
}
