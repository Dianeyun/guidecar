package com.xzy.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
<<<<<<< HEAD
import com.xzy.entity.Company;

=======
<<<<<<< HEAD

import com.xzy.entity.Company;
=======
>>>>>>> d75f37ac26b1671ae3b85d3716fd4ea6959e117a
>>>>>>> a7828c9b350017c79b65171db32dcad3185a020f
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
>>>>>>> a7828c9b350017c79b65171db32dcad3185a020f
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
>>>>>>> a7828c9b350017c79b65171db32dcad3185a020f
}
