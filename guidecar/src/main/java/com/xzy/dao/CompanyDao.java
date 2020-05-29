package com.xzy.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.xzy.entity.Company;
/**
 * 公司映射SQL接口
 * @author J·Y
 *
 */
public interface CompanyDao {
	/**
	 * 	查询公司列表
	 * @return  全部的公司信息
	 */
	List<Map<String,Object>> findCompanyList(HashMap<String,Object> map);
	/**
	 * 统计全部公司
	 * @return  总条数
	 */
	int findCompanyCount();
	/**
	 * 添加公司
	 * @param company 公司信息
	 * @return 1-成功   0-失败
	 */
	int addCompany(Company company);
}
