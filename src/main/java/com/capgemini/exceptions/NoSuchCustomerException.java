package com.capgemini.exceptions;

public class NoSuchCustomerException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public NoSuchCustomerException()
	{}

	public NoSuchCustomerException(String message) {
		super(message);
	}
}
