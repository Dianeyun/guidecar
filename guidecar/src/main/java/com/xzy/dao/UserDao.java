package com.xzy.dao;
<<<<<<< HEAD

import com.xzy.entity.User;
import org.apache.ibatis.annotations.Param;

=======
<<<<<<< HEAD
import com.xzy.entity.User;

=======

<<<<<<< HEAD
import com.xzy.entity.User;

<<<<<<< HEAD
=======


>>>>>>> yq
=======
>>>>>>> d75f37ac26b1671ae3b85d3716fd4ea6959e117a
import org.apache.ibatis.annotations.Param;

import com.xzy.entity.User;

<<<<<<< HEAD
=======

>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
>>>>>>> d75f37ac26b1671ae3b85d3716fd4ea6959e117a
>>>>>>> a7828c9b350017c79b65171db32dcad3185a020f
public interface UserDao {
	
	User findById(int id);
	
	User findByUsername(String username);
<<<<<<< HEAD

    	
	//注册
	int findAdd(User user);


	
	void update(User user);


	//登录
	//根据用户名和密码查询用户
	User findByUsernameAndPwd(User user);
	
	
	

=======
<<<<<<< HEAD
=======
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
    	
>>>>>>> d75f37ac26b1671ae3b85d3716fd4ea6959e117a
	//注册
	void update(User user);
	//登录
	//根据用户名和密码查询用户
	void findByUsernameAndPwd(@Param("name") String name,@Param("password") String passwordd);
	
	
	
<<<<<<< HEAD
=======
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
>>>>>>> d75f37ac26b1671ae3b85d3716fd4ea6959e117a
	
>>>>>>> a7828c9b350017c79b65171db32dcad3185a020f
}
