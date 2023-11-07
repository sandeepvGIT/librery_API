package com.myhcl.library.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myhcl.library.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
	
	public Optional<Book> findByTitle(String title);
	public Optional<Book> findByAuthor(String author);
	public Optional<Book> findByIsbn(String isbn);

}
