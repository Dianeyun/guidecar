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
    	
	//ע��
	int findAdd(User user);
	//��¼
	//�����û����������ѯ�û�
	//public User findByUsernameAndPwd(@Param("name") String name,@Param("password") String password);
	public User findByUsernameAndPwd(User user);
	

>>>>>>> yq
=======
    	
	//ע��
	void update(User user);
	//��¼
	//�����û����������ѯ�û�
	void findByUsernameAndPwd(@Param("name") String name,@Param("password") String passwordd);
	
	
	
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
	
}
