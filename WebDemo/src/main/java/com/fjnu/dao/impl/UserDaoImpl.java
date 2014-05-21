package com.fjnu.dao.impl;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fjnu.dao.UserDao;
import com.fjnu.domain.User;
@Repository
public class UserDaoImpl implements UserDao{
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void saveUser(User user) {
		Session session = sessionFactory.openSession();
		session.save(user);
		session.close();
	}

	@Override
	public User getUserById(String username) {
		Session session = sessionFactory.openSession();
		User user=(User) session.get(User.class, username);
		session.close();
		return user;
		
	}
	
}
