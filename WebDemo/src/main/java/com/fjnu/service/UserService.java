package com.fjnu.service;

import com.fjnu.domain.User;

public interface UserService {
	public boolean login(User user);
	public boolean save(User user);
}
