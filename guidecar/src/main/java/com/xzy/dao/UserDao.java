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
    	
	//注册
	int findAdd(User user);
	//登录
	//根据用户名和密码查询用户
	//public User findByUsernameAndPwd(@Param("name") String name,@Param("password") String password);
	public User findByUsernameAndPwd(User user);
	

>>>>>>> yq
	
}
