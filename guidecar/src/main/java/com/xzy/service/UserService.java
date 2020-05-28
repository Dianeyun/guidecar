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
	
	//�����û�id��ѯ�û�
	public User findById(int id) {
		return userDao.findById(id);
	}
	//�����û�����ѯ�û�
	public User findByUsername(String username) {
		return userDao.findByUsername(username);
	}
	
	//�����û�
	
	public void update(User user) {
		userDao.update(user);
	}
	//��¼
	//�����û�id�������ѯ
	public void findByUsernameAndPwd(String name,String password) {
		userDao.findByUsernameAndPwd(name, password);
	}

	
	
	

}
