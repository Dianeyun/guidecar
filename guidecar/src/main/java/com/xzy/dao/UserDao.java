package com.xzy.dao;

import com.xzy.entity.User;

<<<<<<< HEAD
=======


>>>>>>> yq
public interface UserDao {
	
	User findById(int id);
	
	User findByUsername(String username);
<<<<<<< HEAD
=======
    	
	//ע��
	int findAdd(User user);
	//��¼
	//�����û����������ѯ�û�
	//public User findByUsernameAndPwd(@Param("name") String name,@Param("password") String password);
	public User findByUsernameAndPwd(User user);
	

>>>>>>> yq
	
}
