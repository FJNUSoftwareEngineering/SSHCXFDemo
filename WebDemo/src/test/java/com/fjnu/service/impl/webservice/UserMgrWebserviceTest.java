package com.fjnu.service.impl.webservice;


import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fjnu.domain.User;
import com.fjnu.service.webservice.UserMgrWebservice;

import junit.framework.TestCase;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/applicationContext.xml")
public class UserMgrWebserviceTest extends TestCase {
	@Autowired
	private UserMgrWebservice service;
	@Test
	public void test() {
		assertEquals(true, service.login("123","123"));
	}

}
