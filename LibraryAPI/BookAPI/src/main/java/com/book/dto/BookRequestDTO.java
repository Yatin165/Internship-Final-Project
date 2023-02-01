package com.book.dto;

import java.time.LocalDateTime;

import com.book.entity.Book;

public class BookRequestDTO {

	private int bookId;
	private String bookName;
	private String authorName;
	private int issuedTo;
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
	public int getIssuedTo() {
		return issuedTo;
	}
	public void setIssuedTo(int issuedTo) {
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
	public Book changeToEntity() {
		Book book = new Book();
		book.setAuthorName(this.authorName);
		book.setAvailability(this.availability);
		book.setBookId(this.bookId);
		book.setBookName(this.bookName);
		book.setIssueDate(this.issueDate);
		book.setIssuedTo(this.issuedTo);
		return book;
	}
}
