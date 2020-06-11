package com.xzy.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.xzy.dao.LoginDao;


import com.xzy.entity.User;
@Service
@Transactional
public class LoginService {
	@Autowired
	private LoginDao loginDao;
	public User findById(int id) {
		return loginDao.findById(id);
	}

	
	//根据用户名查询用户

	public User findByUsername(String username) {
		return loginDao.findByUsername(username);
	}



	//登录
	//根据用户id和密码查询
	public User findByUsernameAndPwd(User user) {
		return loginDao.findByUsernameAndPwd(user);
	}

	
	//新增用户
	
	public int findAdd(User user) {
		return loginDao.findAdd(user);
		
	}
	
	/**
	 * 根据手机号修改你密码
	 * @param password
	 * @param phone
	 * @return
	 */
	public int modifyPasswordByPhone(String phone,String password) {
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("phone", phone);
		map.put("password", password);
		return loginDao.modifyPasswordByPhone(map);
	}
	

}
