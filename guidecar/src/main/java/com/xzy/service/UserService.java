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
	
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> master
>>>>>>> zhangyunjie
	
	public User findById(int id) {
		return userDao.findById(id);
	}
	
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
	//根据用户id查询用户
	public User findById(int id) {
		return userDao.findById(id);
	}
	//根据用户名查询用户
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
=======
>>>>>>> master
>>>>>>> zhangyunjie
	public User findByUsername(String username) {
		return userDao.findByUsername(username);
	}
	
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
	//新增用户
	
	public void update(User user) {
		userDao.update(user);
	}
	//登录
	//根据用户id和密码查询
	public void findByUsernameAndPwd(String name,String password) {
		userDao.findByUsernameAndPwd(name, password);
	}

	
	
	
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
=======
>>>>>>> master
>>>>>>> zhangyunjie

}
