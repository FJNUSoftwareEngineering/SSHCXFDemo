package com.fjnu.service.webservice;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.security.auth.login.LoginContext;

@WebService
public interface UserMgrWebservice {
	public boolean login(@WebParam(name = "username") String username,
			@WebParam(name = "password") String password);
}
