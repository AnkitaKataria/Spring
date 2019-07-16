package com.ajay;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalControllerHandler {
	@ExceptionHandler(value=NullPointerException.class)
	public String handleNullPointer(NullPointerException e) {
		System.out.println("Null pointer exception occurred");
		return "NullPointerException";
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)//If any exception other than NullPointer occurs, it will thorw 500 error
	@ExceptionHandler(value=NullPointerException.class)
	public String handleUnknownExc(Exception e) {
		System.out.println("Unknown exception occurred");
		return "NullPointerException";
	}
}
