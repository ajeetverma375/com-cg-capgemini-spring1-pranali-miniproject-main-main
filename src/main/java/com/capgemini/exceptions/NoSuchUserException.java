package com.capgemini.exceptions;

public class NoSuchUserException extends Exception {
	private String message;
	public NoSuchUserException(String message) {
		super(message);
	}
}
