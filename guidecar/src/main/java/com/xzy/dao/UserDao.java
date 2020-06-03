package com.xzy.dao;


import com.xzy.entity.User;

public interface UserDao {
	
	User findById(int id);
	
	User findByUsername(String username);

    	
	//ע��
	int findAdd(User user);


	
	void update(User user);


	//��¼
	//�����û����������ѯ�û�
	User findByUsernameAndPwd(User user);
}
