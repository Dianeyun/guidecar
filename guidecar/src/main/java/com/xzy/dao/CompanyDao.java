package com.xzy.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD

import com.xzy.entity.Company;
=======
>>>>>>> d75f37ac26b1671ae3b85d3716fd4ea6959e117a
>>>>>>> zhangyunjie
>>>>>>> d47052da0dd85e409feae8f7ffd0417c82ba2fe8
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
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
	/**
	 * ��ӹ�˾
	 * @param company ��˾��Ϣ
	 * @return 1-�ɹ�   0-ʧ��
	 */
	int addCompany(Company company);
=======
>>>>>>> d75f37ac26b1671ae3b85d3716fd4ea6959e117a
>>>>>>> zhangyunjie
>>>>>>> d47052da0dd85e409feae8f7ffd0417c82ba2fe8
}
