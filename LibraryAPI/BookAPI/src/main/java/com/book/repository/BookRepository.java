package com.book.repository;

import org.springframework.data.repository.CrudRepository;

import com.book.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

}
