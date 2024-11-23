package com.example.librarymanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.librarymanagementsystem.model.Book;
import com.example.librarymanagementsystem.service.BookService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/books")
public class BookController 
{
	@Autowired
	private BookService bookService;
	
	@PostMapping("{id}")
	public ResponseEntity<Book> createBook(@Valid @RequestBody Book book)
	{
		return ResponseEntity.ok(bookService.createBook(book));
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Book> updateBook(@PathVariable Long id, @Valid @RequestBody Book book)
	{
		return ResponseEntity.ok(bookService.updateBook(id, book));
		
	}
	
	@GetMapping("/{id}") 
	public ResponseEntity<Book> getBookById(@PathVariable Long id)
	{
		return ResponseEntity.ok(bookService.getBooById(id));
		
	}
	
	@GetMapping
	public ResponseEntity<List<Book>> getAllBooks()
	{
		return ResponseEntity.ok(bookService.getAllBooks());
		
	}
	
	public ResponseEntity<Void> deleteBook(@PathVariable Long id)
	{
		bookService.deleteBook(id);
		return ResponseEntity.noContent().build();
	}
}
