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
	
	
	public User findById(int id) {
		return userDao.findById(id);
	}
	
=======

	

	//根据用户id查询用户
	public User findById(int id) {
		return userDao.findById(id);
	}
	//根据用户名查询用户

>>>>>>> yq
	public User findByUsername(String username) {
		return userDao.findByUsername(username);
	}
	

<<<<<<< HEAD
=======
	//新增用户
	
	public int findAdd(User user) {
		return userDao.findAdd(user);
		
	}
	//登录
	//根据用户id和密码查询
	/*public User findByUsernameAndPwd(String name,String password) {
		User user=userDao.findByUsernameAndPwd(name, password);
		return user;
	}*/
	public User findByUsernameAndPwd(User user) {
		User u=userDao.findByUsernameAndPwd(user);
		return u;
	}



>>>>>>> yq
}
