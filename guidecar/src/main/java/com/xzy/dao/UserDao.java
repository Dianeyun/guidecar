package com.xzy.dao;

import org.apache.ibatis.annotations.Param;

import com.xzy.entity.User;


public interface UserDao {
	
	User findById(int id);
	
	User findByUsername(String username);
    	
	//注册
	void update(User user);
	//登录
	//根据用户名和密码查询用户
	void findByUsernameAndPwd(@Param("name") String name,@Param("password") String passwordd);
	
	
	
	
}
