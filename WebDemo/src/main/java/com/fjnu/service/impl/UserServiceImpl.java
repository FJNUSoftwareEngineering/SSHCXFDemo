package com.fjnu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fjnu.dao.UserDao;
import com.fjnu.domain.User;
import com.fjnu.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	@Override
	public boolean login(User user) {
		User u=userDao.getUserById(user.getUsername());
		if(u==null)
			return false;
		else
			return u.getPassword().equals(user.getPassword())?true:false;
	}

}
