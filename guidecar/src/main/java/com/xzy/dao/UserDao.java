package com.xzy.dao;

import com.xzy.entity.User;

import org.apache.ibatis.annotations.Param;

public interface UserDao {
	
	User findById(int id);
	
	User findByUsername(String username);

    	
	//注册
	int findAdd(User user);

	
	void update(User user);

	//登录
	//根据用户名和密码查询用户
	User findByUsernameAndPwd(User user);
	
	
	
	

    	
	




	//登录
	//根据用户名和密码查询用户
	void findByUsernameAndPwd(@Param("name") String name,@Param("password") String passwordd);
	
	
	

}
