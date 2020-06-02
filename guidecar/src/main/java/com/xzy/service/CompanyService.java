package com.xzy.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xzy.dao.CompanyDao;
import com.xzy.entity.Company;
/**
 * 公司业务处理
 * @author J·Y
 *
 */

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
	/**
	 * 添加公司
	 * @param company  公司信息
	 * @return 1-成功  0-失败
	 */
	public int addCompany(Company company) {
		return companyDao.addCompany(company);
	}


	/**
	 * 根据id删除公司
	 * @param id id值
	 * @return 1-成功   0-失败
	 */
	public int delCompany(int id) {
		return companyDao.delCompany(id);
	}
	/**
	 * 根据id查询公司信息
	 * @param id 公司id值
	 * @return 公司信息
	 */
	public Company findCompanyById(int id) {
		return companyDao.findCompanyById(id);
	}
	/**
	 * 修改公司信息
	 * @param company 要修改的公司信息
	 * @return  1-成功  0-失败
	 */
	public int companyModify(Company company) {
		return companyDao.companyModify(company);
	}
}
