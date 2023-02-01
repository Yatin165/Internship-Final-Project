package com.student.dto;

import com.student.entity.Student;

public class StudentRequestDTO {
	
	private int studentId;
	private String name;
	private String emailId;
	private int phoneNumber;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Student changeToEntity() {
		
		Student student = new Student();
		student.setEmailId(this.emailId);
		student.setName(this.name);
		student.setPhoneNumber(this.phoneNumber);
		student.setStudentId(this.studentId);
		return student;
		
	}
}
