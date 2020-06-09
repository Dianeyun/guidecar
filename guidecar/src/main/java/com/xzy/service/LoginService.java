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

	
	//�����û�����ѯ�û�

	public User findByUsername(String username) {
		return loginDao.findByUsername(username);
	}



	//��¼
	//�����û�id�������ѯ
	public User findByUsernameAndPwd(User user) {
		return loginDao.findByUsernameAndPwd(user);
	}

	
	//�����û�
	
	public int findAdd(User user) {
		return loginDao.findAdd(user);
		
	}
	

}
