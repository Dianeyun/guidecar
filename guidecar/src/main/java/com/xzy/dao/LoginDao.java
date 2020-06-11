package com.xzy.dao;



import java.util.Map;

import com.xzy.entity.User;

public interface LoginDao {
	
	User findById(int id);
	
	User findByUsername(String username);

    	
	//ע��
	int findAdd(User user);

	//��¼
	//�����û����������ѯ�û�
	User findByUsernameAndPwd(User user);
	
	
	/**
	 * �����ֻ��Ų�ѯ����
	 * @param phone
	 * @return
	 */
	User findByPhone(String phone);
	
	/**
	 * �����ֻ����޸�����
	 * @param map
	 * @return
	 */
	int modifyPasswordByPhone(Map<String,Object>map);
	
	
	
	
	

}
