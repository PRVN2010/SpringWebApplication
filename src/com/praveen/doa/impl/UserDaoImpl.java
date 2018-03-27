package com.praveen.doa.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.praveen.dao.UserDao;
import com.praveen.model.UserModel;
@Repository
public class UserDaoImpl implements UserDao{
	
	@Autowired
	SessionFactory sessionFactory;
	
	/*public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
*/
	public  UserDaoImpl() {
		
		System.out.println("object is created for dao impl.");
	}

	@Override
	public boolean save(UserModel model) {
		 Session session = sessionFactory.openSession();
		 session.beginTransaction();
		 session.save(model);
		 session.getTransaction().commit();
		 session.close();
		 return true;
	}

}
