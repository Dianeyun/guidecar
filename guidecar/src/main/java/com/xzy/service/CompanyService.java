package com.xzy.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * ��˾ҵ����
 * @author J��Y
 *
 */

import com.xzy.dao.CompanyDao;
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
	
}
