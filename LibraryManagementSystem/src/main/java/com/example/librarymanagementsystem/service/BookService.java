package com.example.librarymanagementsystem.service;

import java.util.List;

import com.example.librarymanagementsystem.model.Book;

public interface BookService 
{
	Book createBook(Book book);
	
	Book updateBook(Long id, Book book);
	
	Book getBooById(Long id);
	
	List<Book> getAllBooks();
	
	void deleteBook(Long id);
}
