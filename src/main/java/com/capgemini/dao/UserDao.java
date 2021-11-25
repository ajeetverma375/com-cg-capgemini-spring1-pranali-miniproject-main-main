package com.capgemini.dao;

import com.capgemini.model.User;

public interface UserDao {
	public User createUser(User user);
	public User loginUser(User user);
	public void changePassword(User user);
	public void forgotPassword(String userName);
	public User readUserByUserName(String userName);
	public User readUserByUserId(int userId);

}
