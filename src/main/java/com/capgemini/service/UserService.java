package com.capgemini.service;

import com.capgemini.exceptions.DuplicateUserException;
import com.capgemini.exceptions.InvalidLoginCredentialException;
import com.capgemini.exceptions.NoSuchUserException;
import com.capgemini.model.User;

public interface UserService {
	public User registerUser(User user) throws DuplicateUserException;
	public User loginUser(User user) throws InvalidLoginCredentialException;
	public void changePassword(User user);
	public void forgotPassword(String userName);
	public void emailPassword(String email);
	public User searchUserByUserName(String userName)throws NoSuchUserException;
	public User searchUserByUserId(int userId)throws NoSuchUserException;
}
