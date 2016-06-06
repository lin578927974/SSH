package com.ale.serviceImpl;

import org.springframework.beans.BeanUtils;

import com.ale.beans.User;
import com.ale.dao.BaseDao;
import com.ale.daoImpl.UserDao;
import com.ale.forms.UserForm;
import com.ale.service.UserManager;

public class UserManagerImpl implements UserManager {
	private BaseDao dao;
	
	public void setDao(BaseDao dao) {
		this.dao = dao;
	}
	
	@Override
	public void regUser(UserForm userForm){
/*		session=HibernateSessionFactory.currentSession();
		dao.setSession(session);
		//获取事务
		Transaction transaction=session.beginTransaction();
		//构造对象
		User user=new User();
		user.setUsername(userForm.getUsername());
		user.setPassword(userForm.getPassword());
		user.setGender(userForm.getGender());
		//保存user对象
		dao.saveObject(user);
		//提交事务
		transaction.commit();
		//关闭Session
		HibernateSessionFactory.closeSession();
		*/
		User user=new User();
		BeanUtils.copyProperties(userForm, user);
		dao.saveObject(user);
	}
}
