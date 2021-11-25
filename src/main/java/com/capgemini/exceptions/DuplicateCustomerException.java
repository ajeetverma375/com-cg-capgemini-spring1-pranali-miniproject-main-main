package com.capgemini.exceptions;

public class DuplicateCustomerException extends Exception {
	private String message;
	public DuplicateCustomerException(String message) {
		super(message);
	}
}
