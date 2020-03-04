package edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model;

import java.time.LocalDate;

import edu.mum.cs.cs425.demos.studentrecordsmgmtapp.MyStudentRecordsMgmtApp;

public class Student {
	public Student() {
		
	}

	public Student(String studentId, String name) {
		
		this.studentId = studentId;
		this.name = name;
	}

	public Student(String studentId, String name, int yr, int mon, int day) {
	
		this.studentId = studentId;
		this.name = name;
		this.dateOfAdmission = LocalDate.of(yr, mon, day);
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfAdmission() {
		return dateOfAdmission;
	}

	public void setDateOfAdmission(LocalDate dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}

	private String studentId;
	private String name;
	private LocalDate dateOfAdmission;
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", dateOfAdmission=" + dateOfAdmission + "]";
	}
	
	

}
