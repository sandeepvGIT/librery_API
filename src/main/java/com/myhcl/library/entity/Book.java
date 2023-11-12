package com.myhcl.library.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "book_tab")
@Data
public class Book {
	 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "book_id_col")
	 private Long bookId;
	@Column(name = "book_author_col")
	 private String author;
	@Column(name = "book_title_col")
	 private String title;
	@Column(name = "book_isbn_col")
	 private String Isbn;
	@Column(name = "book_year_col")
	 private Long publicationYear;
	@Column(name = "book_quantity_col")
	 private Integer quantity;
	 

}
