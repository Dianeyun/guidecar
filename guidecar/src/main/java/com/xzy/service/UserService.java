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
<<<<<<< HEAD
		
	
=======
<<<<<<< HEAD
<<<<<<< HEAD
	
>>>>>>> a7828c9b350017c79b65171db32dcad3185a020f
	
	public User findById(int id) {
		return userDao.findById(id);
	}
	
<<<<<<< HEAD
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
	public User findByUsernameAndPwd(User user) {
		return userDao.findByUsernameAndPwd(user);
	}

	
=======
=======

	

=======
	
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
>>>>>>> d75f37ac26b1671ae3b85d3716fd4ea6959e117a
>>>>>>> a7828c9b350017c79b65171db32dcad3185a020f
	//�����û�id��ѯ�û�
	public User findById(int id) {
		return userDao.findById(id);
	}
	//�����û�����ѯ�û�
<<<<<<< HEAD
	public User findByUsername(String username) {
		return userDao.findByUsername(username);
	}
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
	public User findByUsername(String username) {
		return userDao.findByUsername(username);
	}
	
<<<<<<< HEAD

<<<<<<< HEAD
=======
>>>>>>> a7828c9b350017c79b65171db32dcad3185a020f
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

<<<<<<< HEAD
=======


>>>>>>> yq
=======
>>>>>>> d75f37ac26b1671ae3b85d3716fd4ea6959e117a
>>>>>>> a7828c9b350017c79b65171db32dcad3185a020f
	//�����û�
	
	public void update(User user) {
		userDao.update(user);
	}
	//��¼
	//�����û�id�������ѯ
	public void findByUsernameAndPwd(String name,String password) {
		userDao.findByUsernameAndPwd(name, password);
	}

<<<<<<< HEAD
=======
	
<<<<<<< HEAD


=======
	
	

>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
>>>>>>> d75f37ac26b1671ae3b85d3716fd4ea6959e117a
>>>>>>> a7828c9b350017c79b65171db32dcad3185a020f
}
