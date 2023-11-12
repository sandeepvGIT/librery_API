package com.myhcl.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myhcl.library.entity.Book;
import com.myhcl.library.exception.BookNotFoundException;
import com.myhcl.library.service.IBookService;

@RestController
@RequestMapping("/book")
public class BookRestController {
	@Autowired
	private IBookService service;
	
	@PostMapping("/create")
	public ResponseEntity<String> createBook(@RequestBody Book book){
		ResponseEntity<String> response=null;
		try {
			Long id=service.createBook(book);
			String body="Book created";
			response=new ResponseEntity<String>(body,HttpStatus.OK);
		}catch (BookNotFoundException be) {
			throw be;
		}
		return response;
	}
	@GetMapping("/find/title/{title}")
	public ResponseEntity<Book> getBookByTitle(@PathVariable String title){
		ResponseEntity<Book> response=null;
		try {
			Book book=service.getBookByTitle(title);
			response=new ResponseEntity<Book>(book,HttpStatus.OK);
		}catch (BookNotFoundException be) {
			throw be;
		}
		return response;
		
	}
	@GetMapping("/find/author/{author}")
	public ResponseEntity<Book> getBookByAthor(@PathVariable String author){
		ResponseEntity<Book> response=null;
		try {
			Book book=service.getBookByAuthor(author);
			response=new ResponseEntity<Book>(book,HttpStatus.OK);
		}catch (BookNotFoundException be) {
			throw be;
		}
		return response;
		
	}
	
	@GetMapping("/find/isbn/{isbn}")
	public ResponseEntity<Book> getBookByISBN(@PathVariable String isbn){
		ResponseEntity<Book> response=null;
		try {
			Book book=service.getBookByISBN(isbn);
			response=new ResponseEntity<Book>(book,HttpStatus.OK);
		}catch (BookNotFoundException be) {
			throw be;
		}
		return response;
		
	}

}
