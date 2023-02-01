package com.student.utility;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.student.exception.StudentException;

@RestControllerAdvice
public class ExceptionController {

	@ExceptionHandler
	public ResponseEntity<String> studentNotAvailableException(Exception exception) {
		ErrorInfo errorinfo = new ErrorInfo();
		errorinfo.setErrorcode(HttpStatus.NOT_FOUND);
		errorinfo.setMessage(exception.getMessage());
		errorinfo.setTime(LocalDateTime.now());
		return new ResponseEntity<>(exception.getMessage(),HttpStatus.NOT_FOUND);
	}
}
