package com.xzy.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
<<<<<<< HEAD
import com.xzy.dao.CompanyDao;
import com.xzy.entity.Company;
=======
<<<<<<< HEAD
import com.xzy.dao.CompanyDao;
import com.xzy.entity.Company;
=======
>>>>>>> a7828c9b350017c79b65171db32dcad3185a020f
>>>>>>> zhangyunjie
/**
 * ��˾ҵ����
 * @author J��Y
 *
 */
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

import com.xzy.dao.CompanyDao;
<<<<<<< HEAD
import com.xzy.entity.Company;
=======
>>>>>>> d75f37ac26b1671ae3b85d3716fd4ea6959e117a
>>>>>>> a7828c9b350017c79b65171db32dcad3185a020f
>>>>>>> zhangyunjie
@Service
public class CompanyService {
	@Autowired
	private CompanyDao companyDao;
	/**
	 * ��ѯ��˾�б�
	 * @param page ��ʼ����
	 * @param limit ÿҳ��ʾ����
	 * @return ȫ���Ĺ�˾��Ϣ
	 */
	public List<Map<String,Object>> findCompanyList(int page,int limit){
		//�Ѳ�ѯ����,��ҳ����,���򶼷�װ��map������
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("pageSize", limit);
		map.put("start", (page-1)*limit);
		return  companyDao.findCompanyList(map);
	}
	/**
	 * ͳ��ȫ����˾
	 * @return  ������
	 */
	public int findCompanyCount() {
		return companyDao.findCompanyCount();
	}
<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> zhangyunjie
=======
=======
<<<<<<< HEAD
>>>>>>> a7828c9b350017c79b65171db32dcad3185a020f
>>>>>>> zhangyunjie
	/**
	 * ��ӹ�˾
	 * @param company  ��˾��Ϣ
	 * @return 1-�ɹ�  0-ʧ��
	 */
	public int addCompany(Company company) {
		return companyDao.addCompany(company);
	}
<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> zhangyunjie
=======
>>>>>>> zhangyunjie

	/**
	 * ����idɾ����˾
	 * @param id idֵ
	 * @return 1-�ɹ�   0-ʧ��
	 */
	public int delCompany(int id) {
		return companyDao.delCompany(id);
	}
	/**
	 * ����id��ѯ��˾��Ϣ
	 * @param id ��˾idֵ
	 * @return ��˾��Ϣ
	 */
	public Company findCompanyById(int id) {
		return companyDao.findCompanyById(id);
	}
	/**
	 * �޸Ĺ�˾��Ϣ
	 * @param company Ҫ�޸ĵĹ�˾��Ϣ
	 * @return  1-�ɹ�  0-ʧ��
	 */
	public int companyModify(Company company) {
		return companyDao.companyModify(company);
	}
<<<<<<< HEAD
=======
=======
=======
	
>>>>>>> d75f37ac26b1671ae3b85d3716fd4ea6959e117a
>>>>>>> a7828c9b350017c79b65171db32dcad3185a020f
>>>>>>> zhangyunjie
}
