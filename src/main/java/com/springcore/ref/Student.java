package com.springcore.ref;

public class Student {
	private String studentName;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String studentName) {
		super();
		this.studentName = studentName;
	}
	

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + "]";
	}
	
	

}
