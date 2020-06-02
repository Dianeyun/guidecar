package com.xzy.dao;

import com.xzy.entity.User;
<<<<<<< HEAD

=======
>>>>>>> zhangyunjie
import org.apache.ibatis.annotations.Param;

public interface UserDao {
	
	User findById(int id);
	
	User findByUsername(String username);

    	
	//注册
	int findAdd(User user);

<<<<<<< HEAD
	
	void update(User user);
=======

	
	void update(User user);

>>>>>>> zhangyunjie

	//登录
	//根据用户名和密码查询用户
	User findByUsernameAndPwd(User user);
	
	
	
<<<<<<< HEAD
	

    	
	




	//登录
	//根据用户名和密码查询用户
	void findByUsernameAndPwd(@Param("name") String name,@Param("password") String passwordd);
	
	
	

=======

>>>>>>> zhangyunjie
}
