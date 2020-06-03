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
}
