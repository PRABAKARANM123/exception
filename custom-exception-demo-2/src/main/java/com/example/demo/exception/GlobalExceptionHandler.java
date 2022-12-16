package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {
	 @ExceptionHandler(value = EmployeeNotFoundException.class)
	 @ResponseStatus(HttpStatus.BAD_REQUEST)
	 public @ResponseBody ErrorObject handleException(EmployeeNotFoundException ex)
	 {
		 return new ErrorObject(
				 HttpStatus.NOT_FOUND.value(), ex.getMessage());
	 }

}
