package com.example.librarymanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.librarymanagementsystem.exception.ResourceNotFoundException;
import com.example.librarymanagementsystem.model.Book;
import com.example.librarymanagementsystem.repository.BookRepository;
import org.springframework.stereotype.Service;

public class BookServiceImpl implements BookService
{
	@Autowired
	private BookRepository bookRepository;

	@Override
	public Book createBook(Book book) {
		
		return bookRepository.save(book);
	}

	@Override
	public Book updateBook(Long id, Book book) {
		
        Book existingBook = bookRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book not found"));
        existingBook.setTitle(book.getTitle());
        existingBook.setAuthor(book.getAuthor());
        existingBook.setPublicationYear(book.getPublicationYear());
        
        return bookRepository.save(existingBook);

	}

	@Override
	public Book getBooById(Long id) {
		
		return bookRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Book Not Found"));
	}

	@Override
	public List<Book> getAllBooks() {
		
		return bookRepository.findAll();
	}

	@Override
	public void deleteBook(Long id) {
		
		bookRepository.deleteById(id);
		
	}
	
}
