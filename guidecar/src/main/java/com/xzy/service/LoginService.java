package com.xzy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.xzy.dao.LoginDao;


import com.xzy.entity.User;
@Service
@Transactional
public class LoginService {
	@Autowired
	private LoginDao loginDao;
	public User findById(int id) {
		return loginDao.findById(id);
	}

	
	//根据用户名查询用户

	public User findByUsername(String username) {
		return loginDao.findByUsername(username);
	}



	//登录
	//根据用户id和密码查询
	public User findByUsernameAndPwd(User user) {
		return loginDao.findByUsernameAndPwd(user);
	}

	
	//新增用户
	
	public int findAdd(User user) {
		return loginDao.findAdd(user);
		
	}
	

}
