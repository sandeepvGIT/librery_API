package com.myhcl.library.handler;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.myhcl.library.exception.BookNotFoundException;
import com.myhcl.library.exception.response.ErorrMessage;

@RestControllerAdvice
public class CustomExceptionHandler {
	
	@ExceptionHandler(BookNotFoundException.class)
	public ResponseEntity<ErorrMessage> handleBookNotFoundException(BookNotFoundException be){
		return ResponseEntity.internalServerError().body(
				new ErorrMessage(be.getMessage(),
						LocalDate.now(),
						HttpStatus.INTERNAL_SERVER_ERROR.value(),
						HttpStatus.INTERNAL_SERVER_ERROR.name()
						)
				);
		
	}

}
