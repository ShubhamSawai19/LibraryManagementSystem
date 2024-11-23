package com.example.librarymanagementsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
@Entity
public class Book 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "Title is mandatory")
	private String title;
	
	@NotBlank(message = "author is mandatory")
	private String author;
	
	@Positive(message = "Publication year must be positive")
	private int publicationYear;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public Book(long id, @NotBlank(message = "Title is mandatory") String title,
			@NotBlank(message = "author is mandatory") String author,
			@Positive(message = "Publication year must be positive") int publicationYear) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", publicationYear=" + publicationYear
				+ "]";
	}
	
	
}
