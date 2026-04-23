package com.example.FoodFly.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<String> handleResourceNotFound(ResourceNotFoundException e){
		
		return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(InvalidInputException.class)
	public ResponseEntity<String> handleInoutException(InvalidInputException e){
		return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(UnauthorizedException.class)
	public ResponseEntity<String> handleUnauthorizedException(UnauthorizedException e){
		return new ResponseEntity<>(e.getMessage(), HttpStatus.UNAUTHORIZED);
	}
	
	@ExceptionHandler(ExternalServiceException.class)
	public ResponseEntity<String> handleExternalServiceException(ExternalServiceException e){
		return new ResponseEntity<>(e.getMessage(), HttpStatus.SERVICE_UNAVAILABLE);
	}
	@ExceptionHandler(BusinessException.class)
	public ResponseEntity<String> handleBusinessException(BusinessException e){
		return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
	
	}
}
	

