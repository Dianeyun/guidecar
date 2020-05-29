package com.xzy.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.xzy.entity.Company;
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
	/**
	 * ��ӹ�˾
	 * @param company ��˾��Ϣ
	 * @return 1-�ɹ�   0-ʧ��
	 */
	int addCompany(Company company);
}
