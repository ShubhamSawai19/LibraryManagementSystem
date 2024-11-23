package com.example.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.librarymanagementsystem.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
