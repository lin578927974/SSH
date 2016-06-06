package com.ale.action;

import com.ale.forms.UserForm;
import com.ale.service.UserManager;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	private static final long serialVersionUID=1L;
	
	private UserForm user;
	
	private UserManager userManager;
	
	public UserForm getUser(){
		return user;
	}
	
	public void setUser(UserForm userForm){
		this.user=userForm;
	}
	
	public UserManager getUserManager(){
		return userManager;
	}
	
	public void setUserManager(UserManager userManager){
		this.userManager=userManager;
	}
	
	@Override
	public String execute(){
		try{
			userManager.regUser(user);
			return SUCCESS;
		}catch(Exception e){
			e.printStackTrace();
			return ERROR;
		}
	}
}
