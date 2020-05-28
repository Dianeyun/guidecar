package com.xzy.dao;

<<<<<<< HEAD
<<<<<<< HEAD
import com.xzy.entity.User;

=======
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
public interface UserDao {
	
	User findById(int id);
	
	User findByUsername(String username);
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
    	
	//注册
	void update(User user);
	//登录
	//根据用户名和密码查询用户
	void findByUsernameAndPwd(@Param("name") String name,@Param("password") String passwordd);
	
	
	
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
=======
>>>>>>> master
>>>>>>> zhangyunjie
=======
>>>>>>> 1779c293b6c2f14e0ca7c01dbf5c819a56ee1e7d
	
}
