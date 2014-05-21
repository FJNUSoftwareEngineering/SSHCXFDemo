package com.fjnu.service.impl.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fjnu.dao.UserDao;
import com.fjnu.domain.User;
import com.fjnu.service.webservice.UserMgrWebservice;
@Service
public class UserMgrWebserviceImpl implements UserMgrWebservice {
	@Autowired
	private UserDao userDao;

	@Override
	public boolean login(String username, String password) {
		User user=userDao.getUserById(username);
		if(user==null)
			return false;
		else
			return user.getPassword().equals(password)?true:false;
	}

}
