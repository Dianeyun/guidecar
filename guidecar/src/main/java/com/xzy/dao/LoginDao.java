package com.xzy.dao;



import java.util.Map;

import com.xzy.entity.User;

public interface LoginDao {
	
	User findById(int id);
	
	User findByUsername(String username);

    	
	//注册
	int findAdd(User user);

	//登录
	//根据用户名和密码查询用户
	User findByUsernameAndPwd(User user);
	
	
	/**
	 * 根据手机号查询密码
	 * @param phone
	 * @return
	 */
	User findByPhone(String phone);
	
	/**
	 * 根据手机号修改密码
	 * @param map
	 * @return
	 */
	int modifyPasswordByPhone(Map<String,Object>map);
	
	
	
	
	

}
