package com.student.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.student.dto.StudentDTO;

@Entity
public class Student {

//	public Student(int studentId, String name, String emailId, int phoneNumber) {
//		super();
//		this.studentId = studentId;
//		this.name = name;
//		this.emailId = emailId;
//		this.phoneNumber = phoneNumber;
//	}
	@Id
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
	public StudentDTO convertToDTO() {
		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setEmailId(this.emailId);
		studentDTO.setName(this.name);
		studentDTO.setPhoneNumber(this.phoneNumber);
		studentDTO.setStudentId(this.studentId);
		return studentDTO;
	}
	
}
