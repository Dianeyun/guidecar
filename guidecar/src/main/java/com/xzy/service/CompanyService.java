package com.xzy.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 公司业务处理
 * @author J·Y
 *
 */

import com.xzy.dao.CompanyDao;
<<<<<<< HEAD
=======
<<<<<<< HEAD
import com.xzy.entity.Company;
=======
>>>>>>> d75f37ac26b1671ae3b85d3716fd4ea6959e117a
>>>>>>> zhangyunjie
@Service
public class CompanyService {
	@Autowired
	private CompanyDao companyDao;
	/**
	 * 查询公司列表
	 * @param page 起始条数
	 * @param limit 每页显示几条
	 * @return 全部的公司信息
	 */
	public List<Map<String,Object>> findCompanyList(int page,int limit){
		//把查询条件,分页条件,排序都封装在map对象中
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("pageSize", limit);
		map.put("start", (page-1)*limit);
		return  companyDao.findCompanyList(map);
	}
	/**
	 * 统计全部公司
	 * @return  总条数
	 */
	public int findCompanyCount() {
		return companyDao.findCompanyCount();
	}
<<<<<<< HEAD
	
=======
<<<<<<< HEAD
	/**
	 * 添加公司
	 * @param company  公司信息
	 * @return 1-成功  0-失败
	 */
	public int addCompany(Company company) {
		return companyDao.addCompany(company);
	}
=======
	
>>>>>>> d75f37ac26b1671ae3b85d3716fd4ea6959e117a
>>>>>>> zhangyunjie
}
