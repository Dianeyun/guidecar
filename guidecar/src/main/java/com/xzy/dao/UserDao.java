package com.xzy.dao;

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
public interface UserDao {
	
	User findById(int id);
	
	User findByUsername(String username);
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
    	
	//ע��
	void update(User user);
	//��¼
	//�����û����������ѯ�û�
	void findByUsernameAndPwd(@Param("name") String name,@Param("password") String passwordd);
	
	
	
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
=======
>>>>>>> master
>>>>>>> zhangyunjie
	
}
