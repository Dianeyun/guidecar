package com.xzy.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * ��˾ӳ��SQL�ӿ�
 * @author J��Y
 *
 */
public interface CompanyDao {
	/**
	 * 	��ѯ��˾�б�
	 * @return  ȫ���Ĺ�˾��Ϣ
	 */
	List<Map<String,Object>> findCompanyList(HashMap<String,Object> map);
	/**
	 * ͳ��ȫ����˾
	 * @return  ������
	 */
	int findCompanyCount();
}
