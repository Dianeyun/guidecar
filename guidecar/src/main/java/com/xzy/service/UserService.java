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
	
	
	public User findById(int id) {
		return userDao.findById(id);
	}
	
=======

	

=======
	
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
	//�����û�id��ѯ�û�
	public User findById(int id) {
		return userDao.findById(id);
	}
	//�����û�����ѯ�û�
<<<<<<< HEAD

>>>>>>> yq
=======
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
	public User findByUsername(String username) {
		return userDao.findByUsername(username);
	}
	
<<<<<<< HEAD

<<<<<<< HEAD
=======
	//�����û�
	
	public int findAdd(User user) {
		return userDao.findAdd(user);
		
	}
	//��¼
	//�����û�id�������ѯ
	/*public User findByUsernameAndPwd(String name,String password) {
		User user=userDao.findByUsernameAndPwd(name, password);
		return user;
	}*/
	public User findByUsernameAndPwd(User user) {
		User u=userDao.findByUsernameAndPwd(user);
		return u;
	}



>>>>>>> yq
=======
	//�����û�
	
	public void update(User user) {
		userDao.update(user);
	}
	//��¼
	//�����û�id�������ѯ
	public void findByUsernameAndPwd(String name,String password) {
		userDao.findByUsernameAndPwd(name, password);
	}

	
	
	

>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
}
