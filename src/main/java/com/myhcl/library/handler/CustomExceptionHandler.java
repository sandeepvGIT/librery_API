package com.myhcl.library.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.myhcl.library.exception.BookNotFoundException;
import com.myhcl.library.payload.response.ErorrMessage;

@RestControllerAdvice
public class CustomExceptionHandler {
	
	@ExceptionHandler(BookNotFoundException.class)
	public ResponseEntity<ErorrMessage> handleBookNotFoundException(BookNotFoundException be){
		return ResponseEntity.internalServerError().body(
				new ErorrMessage(be.getMessage(),
						new Date(),
						HttpStatus.INTERNAL_SERVER_ERROR.value(),
						HttpStatus.INTERNAL_SERVER_ERROR.name()
						)
				);
		
	}

}
