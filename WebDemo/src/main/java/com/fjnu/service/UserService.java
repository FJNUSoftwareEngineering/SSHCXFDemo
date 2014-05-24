package com.fjnu.service;

import com.fjnu.domain.User;
import com.sun.tools.corba.se.idl.StringGen;

public interface UserService {
	public boolean login(User user);
	public boolean save(User user);
}
