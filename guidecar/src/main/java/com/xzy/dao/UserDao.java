package com.xzy.dao;
<<<<<<< HEAD

<<<<<<< HEAD
=======
>>>>>>> zhangyunjie
<<<<<<< HEAD
import com.xzy.entity.User;

=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import com.xzy.entity.User;

=======
import org.apache.ibatis.annotations.Param;

import com.xzy.entity.User;


>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
=======
import com.xzy.entity.User;

>>>>>>> master
>>>>>>> zhangyunjie
=======
import com.xzy.entity.User;

>>>>>>> 1779c293b6c2f14e0ca7c01dbf5c819a56ee1e7d
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
>>>>>>> zhangyunjie
public interface UserDao {
	
	User findById(int id);
	
	User findByUsername(String username);
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> zhangyunjie
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
    	
	//注册
<<<<<<< HEAD
=======
	int findAdd(User user);
	//登录
	//根据用户名和密码查询用户
	//public User findByUsernameAndPwd(@Param("name") String name,@Param("password") String password);
	public User findByUsernameAndPwd(User user);
	

>>>>>>> yq
=======
    	
>>>>>>> d75f37ac26b1671ae3b85d3716fd4ea6959e117a
	//注册
>>>>>>> zhangyunjie
	void update(User user);
	//登录
	//根据用户名和密码查询用户
	void findByUsernameAndPwd(@Param("name") String name,@Param("password") String passwordd);
	
	
	
<<<<<<< HEAD
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
=======
>>>>>>> master
>>>>>>> zhangyunjie
=======
>>>>>>> 1779c293b6c2f14e0ca7c01dbf5c819a56ee1e7d
=======
<<<<<<< HEAD
=======
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
>>>>>>> d75f37ac26b1671ae3b85d3716fd4ea6959e117a
>>>>>>> zhangyunjie
	
}
