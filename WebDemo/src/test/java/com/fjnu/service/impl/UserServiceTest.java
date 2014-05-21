package com.fjnu.service.impl;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fjnu.domain.User;
import com.fjnu.service.UserService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/applicationContext.xml")
public class UserServiceTest extends TestCase{
	@Autowired
	private UserService userService;
	private User user;
	@Test
	public void test() {
		user = new User();
		user.setUsername("123");
		user.setPassword("123");
		assertEquals(true, userService.login(user));
	}

}
