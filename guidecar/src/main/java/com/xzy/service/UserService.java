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
<<<<<<< HEAD
=======


	
=======
<<<<<<< HEAD
	
	
=======
<<<<<<< HEAD
>>>>>>> zhangyunjie
	
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> master
>>>>>>> zhangyunjie
=======
>>>>>>> 1779c293b6c2f14e0ca7c01dbf5c819a56ee1e7d
=======
<<<<<<< HEAD
		
	
=======
<<<<<<< HEAD
<<<<<<< HEAD
	
>>>>>>> zhangyunjie
<<<<<<< HEAD
=======
>>>>>>> bea4996526394f6440a7c03c25b825957a3cb83d
>>>>>>> zhangyunjie
	
	public User findById(int id) {
		return userDao.findById(id);
	}
	
<<<<<<< HEAD
<<<<<<< HEAD
=======

	//根据用户名查询用户

=======
<<<<<<< HEAD
>>>>>>> zhangyunjie
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
=======

	

=======
	
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
>>>>>>> d75f37ac26b1671ae3b85d3716fd4ea6959e117a
>>>>>>> zhangyunjie
<<<<<<< HEAD
=======
>>>>>>> d47052da0dd85e409feae8f7ffd0417c82ba2fe8
>>>>>>> zhangyunjie
	//根据用户id查询用户
	public User findById(int id) {
		return userDao.findById(id);
	}
	//根据用户名查询用户
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
>>>>>>> zhangyunjie
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
=======
>>>>>>> master
>>>>>>> zhangyunjie
=======
>>>>>>> 1779c293b6c2f14e0ca7c01dbf5c819a56ee1e7d
=======
<<<<<<< HEAD
	public User findByUsername(String username) {
		return userDao.findByUsername(username);
	}
=======
<<<<<<< HEAD

>>>>>>> yq
=======
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
>>>>>>> zhangyunjie
<<<<<<< HEAD
=======
>>>>>>> d47052da0dd85e409feae8f7ffd0417c82ba2fe8
>>>>>>> bea4996526394f6440a7c03c25b825957a3cb83d
>>>>>>> zhangyunjie
	public User findByUsername(String username) {
		return userDao.findByUsername(username);
	}
	
<<<<<<< HEAD
<<<<<<< HEAD
=======

	//新增用户
	
	public void update(User user) {
		userDao.update(user);
	}
	//登录
	//根据用户id和密码查询
	public User findByUsernameAndPwd(User user) {
		return userDao.findByUsernameAndPwd(user);
	}

	public int findAdd(User user) {
		return userDao.findAdd(user);
	}

=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> zhangyunjie
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> d47052da0dd85e409feae8f7ffd0417c82ba2fe8
>>>>>>> zhangyunjie
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

<<<<<<< HEAD
=======
<<<<<<< HEAD
	
	

	
	
	

=======
>>>>>>> zhangyunjie


>>>>>>> yq
=======
>>>>>>> d75f37ac26b1671ae3b85d3716fd4ea6959e117a
>>>>>>> zhangyunjie
	//新增用户
	
	public void update(User user) {
		userDao.update(user);
	}
	//登录
	//根据用户id和密码查询
	public void findByUsernameAndPwd(String name,String password) {
		userDao.findByUsernameAndPwd(name, password);
	}

	
<<<<<<< HEAD
	
	
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
=======
>>>>>>> master
>>>>>>> zhangyunjie
=======
>>>>>>> 1779c293b6c2f14e0ca7c01dbf5c819a56ee1e7d

=======
<<<<<<< HEAD


=======
	
	

>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
>>>>>>> d75f37ac26b1671ae3b85d3716fd4ea6959e117a
>>>>>>> zhangyunjie
<<<<<<< HEAD
=======
>>>>>>> d47052da0dd85e409feae8f7ffd0417c82ba2fe8
>>>>>>> bea4996526394f6440a7c03c25b825957a3cb83d
>>>>>>> zhangyunjie
}
