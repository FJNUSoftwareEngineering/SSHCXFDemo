package com.fjnu.web.action;

import javax.security.auth.login.LoginContext;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.fjnu.domain.User;
import com.fjnu.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
@Controller
@Namespace("/www")
@Scope("prototype")
public class UserAction extends ActionSupport{
	private String username;
	private String password;
	@Autowired
	private UserService userService;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Action(value="login",results={
			@Result(name="success",location="/success.jsp"),
			@Result(name="error",location="/error.jsp")
	})
	public String login() throws Exception{
		User user=new User();
		user.setUsername(username);
		user.setPassword(password);
		return userService.login(user)?SUCCESS:ERROR;
	}
	
}
