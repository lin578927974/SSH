package com.ale.daoImpl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ale.dao.BaseDao;

public class UserDao  implements BaseDao{
	private SessionFactory sessionFactory;  
    
    public SessionFactory getSessionFactory() {  
        return sessionFactory;  
    }  
  
    @Autowired  
    public void setSessionFactory(SessionFactory sessionFactory) {  
        this.sessionFactory = sessionFactory;  
    }  
  
    private Session getCurrentSession() {  
        return sessionFactory.openSession();  
       // return sessionFactory.getCurrentSession();
    
    }
    
	@Override  
    public void saveObject(Object obj) throws HibernateException {  
		this.getCurrentSession().save(obj);
    }

}
