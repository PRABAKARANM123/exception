package com.example.demo.exception;

public class ErrorObject {
	
    private int statusCode;	
	private String message;	
	
	public ErrorObject() {
		super();
	}
	
	public ErrorObject(int status, String message) {
		super();
		this.statusCode = status;
		this.message = message;
	}
	
	public int getStatus() {
		return statusCode;
	}
	public void setStatus(int status) {
		this.statusCode = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
