package com.xzy.dao;

import org.apache.ibatis.annotations.Param;
import com.xzy.entity.User;
public interface UserDao {
	
	User findById(int id);
	
	User findByUsername(String username);

    	
	//ע��
	int findAdd(User user);
	
	void update(User user);
	//��¼
	//�����û����������ѯ�û�
	//public User findByUsernameAndPwd(@Param("name") String name,@Param("password") String password);
	public User findByUsernameAndPwd(User user);
	
}
