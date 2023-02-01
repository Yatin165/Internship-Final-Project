package com.student.dto;

public class StudentDTO {
	private int studentId;
	private String name;
	private String emailId;
	private int phoneNumber;
	BookDTO bookDTO;

	public BookDTO getBookDTO() {
		return bookDTO;
	}

	public void setBookDTO(BookDTO bookDTO) {
		this.bookDTO = bookDTO;
	}

	public int getStudentId() {
		return studentId;
	}

	@Override
	public String toString() {
		return "StudentDTO [studentId=" + studentId + ", name=" + name + ", emailId=" + emailId + ", phoneNumber="
				+ phoneNumber + ", bookDTO=" + bookDTO + "]";
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

}
