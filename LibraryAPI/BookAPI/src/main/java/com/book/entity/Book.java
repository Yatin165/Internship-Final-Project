package com.book.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.book.dto.BookDTO;

@Entity
public class Book {

	@Id
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
	public BookDTO convertToDTO() {
	
		BookDTO bookDTO = new BookDTO();
		bookDTO.setAuthorName(this.authorName);
		bookDTO.setAvailability(this.availability);
		bookDTO.setBookId(this.bookId);
		bookDTO.setBookName(this.bookName);
		bookDTO.setIssueDate(this.issueDate);
		bookDTO.setIssuedTo(this.issuedTo);
		return bookDTO;
	}
	
}
