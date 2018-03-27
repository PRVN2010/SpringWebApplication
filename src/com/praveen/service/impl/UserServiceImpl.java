package com.praveen.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.praveen.dao.UserDao;
import com.praveen.model.UserModel;
import com.praveen.service.User;

@Service
public class UserServiceImpl implements User {
	
	@Autowired
	UserDao userDao;
	
	public  UserServiceImpl() {
		System.out.println(" Object is created for service impl.");
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean save(UserModel model) {
			return userDao.save(model);
	}

}
