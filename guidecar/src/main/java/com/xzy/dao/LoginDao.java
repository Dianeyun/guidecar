package com.xzy.dao;

import com.xzy.entity.User;

import org.apache.ibatis.annotations.Param;

public interface LoginDao {
	
	User findById(int id);
	
	User findByUsername(String username);

    	
	//ע��
	int findAdd(User user);

	//��¼
	//�����û����������ѯ�û�
	User findByUsernameAndPwd(User user);
	
	
	
	
	

}