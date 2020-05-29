package com.xzy.dao;

<<<<<<< HEAD
import com.xzy.entity.User;

<<<<<<< HEAD
=======


>>>>>>> yq
=======
import org.apache.ibatis.annotations.Param;

import com.xzy.entity.User;


>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
public interface UserDao {
	
	User findById(int id);
	
	User findByUsername(String username);
<<<<<<< HEAD
<<<<<<< HEAD
=======
    	
	//注册
	int findAdd(User user);
	//登录
	//根据用户名和密码查询用户
	//public User findByUsernameAndPwd(@Param("name") String name,@Param("password") String password);
	public User findByUsernameAndPwd(User user);
	

>>>>>>> yq
=======
    	
	//注册
	void update(User user);
	//登录
	//根据用户名和密码查询用户
	void findByUsernameAndPwd(@Param("name") String name,@Param("password") String passwordd);
	
	
	
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
	
}
