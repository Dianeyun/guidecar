package com.xzy.dao;

import com.xzy.entity.User;

import org.apache.ibatis.annotations.Param;

public interface UserDao {
	
	User findById(int id);
	
	User findByUsername(String username);

    	
	//ע��
	int findAdd(User user);

	
	void update(User user);

	//��¼
	//�����û����������ѯ�û�
	User findByUsernameAndPwd(User user);
	
	
	
	

    	
	




	//��¼
	//�����û����������ѯ�û�
	void findByUsernameAndPwd(@Param("name") String name,@Param("password") String passwordd);
	
	
	

}
