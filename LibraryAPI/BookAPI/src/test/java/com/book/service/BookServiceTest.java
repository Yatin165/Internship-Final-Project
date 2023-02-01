package com.book.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.book.dto.BookRequestDTO;
import com.book.entity.Book;
import com.book.excepiton.BookException;
import com.book.repository.BookRepository;

@SpringBootTest
class BookServiceTest {

	@InjectMocks
	BookService bookService;

	@Mock
	BookRepository bookRepo;
	
	private Book bookMockObject;
	private BookRequestDTO requestDTOMock;
	
	@BeforeEach
	public void Initialize() {
		bookMockObject = new Book();
		bookMockObject.setBookId(55);
		
		requestDTOMock = new BookRequestDTO();
		requestDTOMock.setBookId(55);
	}

	@Test
	void testaddBookToDatabase_WhenBookNotInDatabase() {
		when(bookRepo.findById(ArgumentMatchers.anyInt())).thenReturn(Optional.empty());
		when(bookRepo.save(bookMockObject)).thenReturn(bookMockObject);
		
		assertEquals(55, bookService.addBookToDatabase(requestDTOMock).getBookId());
	}
	
	@Test
	void testgetBookFromDatabase_WhenBookIsInDatabase() {
		when(bookRepo.findById(bookMockObject.getBookId())).thenReturn(Optional.of(bookMockObject));
		assertEquals(55,bookService.getBookFromDatabase(55).getBookId());
	}
	
	@Test
	void testdeleteBookFromDatabase() {
		when(bookRepo.findById(ArgumentMatchers.anyInt())).thenReturn(Optional.of(new Book()));
		assertNotNull(bookService.deleteBookFromDatabase(100));
	}
	
	@Test
	void testupdateStudentInDatabase() {
		when(bookRepo.findById(ArgumentMatchers.anyInt())).thenReturn(Optional.of(new Book()));
		assertInstanceOf(Book.class,bookService.updateBookInDatabase(requestDTOMock));
	}

}
