package com.capgemini.exceptions;

public class DuplicateUserException extends Exception {
	private String message;
	public DuplicateUserException(String message) {
		super(message);
	}
}
