package com.xzy.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
<<<<<<< HEAD

import com.xzy.entity.Company;


=======
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
>>>>>>> bea4996526394f6440a7c03c25b825957a3cb83d
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
=======
<<<<<<< HEAD
>>>>>>> bea4996526394f6440a7c03c25b825957a3cb83d
	/**
	 * ��ӹ�˾
	 * @param company ��˾��Ϣ
	 * @return 1-�ɹ�   0-ʧ��
	 */
	int addCompany(Company company);
<<<<<<< HEAD

	/**
	 * ����idɾ����˾
	 * @param id idֵ
	 * @return 1-�ɹ�   0-ʧ��
	 */
	int delCompany(int id);
	/**
	 * ����id��ѯ��˾��Ϣ
	 * @param id ��˾idֵ
	 * @return ��˾��Ϣ
	 */
	Company findCompanyById(int id);
	/**
	 * �޸Ĺ�˾��Ϣ
	 * @param company Ҫ�޸ĵĹ�˾��Ϣ
	 * @return  1-�ɹ�  0-ʧ��
	 */
	int companyModify(Company company);

=======
=======
>>>>>>> d75f37ac26b1671ae3b85d3716fd4ea6959e117a
>>>>>>> zhangyunjie
>>>>>>> d47052da0dd85e409feae8f7ffd0417c82ba2fe8
>>>>>>> bea4996526394f6440a7c03c25b825957a3cb83d
}
