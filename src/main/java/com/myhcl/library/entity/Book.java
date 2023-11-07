package com.myhcl.library.entity;

import java.time.LocalDate;

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
	 private Long bookId;
	 private String Author;
	 private String Title;
	 private String Isbn;
	 private Long publicationYear;
	 private Integer quantity;
	 

}
