package com.capgemini.exceptions;

public class InvalidLoginCredentialException extends Exception {
	private String message;
	public InvalidLoginCredentialException(String message) {
		super(message);
	}
}
