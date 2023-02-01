package com.student.dto;

import java.time.LocalDateTime;

public class BookDTO {

	private int bookId;
	private String bookName;
	private String authorName;
	private Integer issuedTo;
	private LocalDateTime issueDate;
	private String availability;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Integer getIssuedTo() {
		return issuedTo;
	}

	public void setIssuedTo(Integer issuedTo) {
		this.issuedTo = issuedTo;
	}

	public LocalDateTime getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDateTime issueDate) {
		this.issueDate = issueDate;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}
}
