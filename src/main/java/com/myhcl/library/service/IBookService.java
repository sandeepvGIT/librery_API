package com.myhcl.library.service;

import java.util.List;

import com.myhcl.library.entity.Book;

public interface IBookService {
	
	public Long createBook(Book book);
	public List<Book> fetchAllBook();
	public Book getBookByTitle(String title);
	public Book getBookByAuthor(String author);
	public Book getBookByISBN(String isbn);
	

}
