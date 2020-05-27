package com.xzy.dao;

import com.xzy.entity.User;

public interface UserDao {
	
	User findById(int id);
	
	User findByUsername(String username);
	
}
