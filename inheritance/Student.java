package com.oops.inheritance;

public class Student extends Person {
	private int rollNo;
	private float marks;
	private String grade;

	// default constructor
	public Student() {
		super();
		rollNo = 0;
		marks = 0;
		grade = "";
	}

	// parameterised constructor
	public Student(String adharNo, String name, String address, int rollNo, float marks, String grade) {
		super(adharNo, name, address);
		this.rollNo = rollNo;
		this.marks = marks;
		this.grade = grade;
	}

	// getter setter method
	public int getRollNo() {
		return rollNo;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", marks=" + marks + ", grade=" + grade + ", "
				+ super.toString() + "]";
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
