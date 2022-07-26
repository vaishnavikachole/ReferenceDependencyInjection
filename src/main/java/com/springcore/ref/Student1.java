package com.springcore.ref;

public class Student1 {
	
	private int studentRollNo;
	private Student stud;
	
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student1(int studentRollNo, Student stud) {
		super();
		this.studentRollNo = studentRollNo;
		this.stud = stud;
	}

	public int getStudentRollNo() {
		return studentRollNo;
	}

	public void setStudentRollNo(int studentRollNo) {
		this.studentRollNo = studentRollNo;
	}

	public Student getStud() {
		return stud;
	}

	public void setStud(Student stud) {
		this.stud = stud;
	}

	@Override
	public String toString() {
		return "Student1 [studentRollNo=" + studentRollNo + ", stud=" + stud + "]";
	}
	
	
	
	
	

}
