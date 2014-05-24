package com.fjnu.dao;

import java.io.IOException;

import com.fjnu.domain.User;

public interface UserDao {
	public void saveUser(User user);
	public User getUserById(String username);
}
