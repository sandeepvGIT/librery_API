package com.myhcl.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myhcl.library.entity.Book;
import com.myhcl.library.exception.BookNotFoundException;
import com.myhcl.library.repository.BookRepository;

@Service
public class BookServiceImpl implements IBookService {
	
	@Autowired
	private BookRepository bookRepo;

	@Override
	public Long createBook(Book book) {
		return bookRepo.save(book).getBookId();
	}

	@Override
	public List<Book> fetchAllBook() {
		return bookRepo.findAll();
	}

	@Override
	public Book getBookByTitle(String title) {
		return bookRepo.findByTitle(title).orElseThrow(()->new BookNotFoundException("Book not found"));
	}

	@Override
	public Book getBookByAuthor(String author) {
		return bookRepo.findByAuthor(author).orElseThrow(()->new BookNotFoundException("Book not found"));
	}

	@Override
	public Book getBookByISBN(String isbn) {
		return bookRepo.findByIsbn(isbn).orElseThrow(()->new BookNotFoundException("Book not found"));
	}

}
