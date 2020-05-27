package com.xzy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xzy.dao.UserDao;
import com.xzy.entity.User;
@Service
@Transactional
public class UserService {
	@Autowired
	private UserDao userDao;
	
	
	public User findById(int id) {
		return userDao.findById(id);
	}
	
	public User findByUsername(String username) {
		return userDao.findByUsername(username);
	}
	

}
