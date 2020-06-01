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
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
	/**
	 * 添加公司
	 * @param company 公司信息
	 * @return 1-成功   0-失败
	 */
	int addCompany(Company company);
=======
>>>>>>> d75f37ac26b1671ae3b85d3716fd4ea6959e117a
>>>>>>> zhangyunjie
>>>>>>> d47052da0dd85e409feae8f7ffd0417c82ba2fe8
}
