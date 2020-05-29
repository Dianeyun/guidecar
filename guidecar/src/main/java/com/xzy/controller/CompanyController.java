package com.xzy.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * 公司控器器
 * @author J·Y
 *
 */
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.xzy.entity.Company;
import com.xzy.entity.DataStatus;
import com.xzy.service.CompanyService;
@Controller
@RequestMapping("/company")
public class CompanyController {
	@Autowired
	private CompanyService companyService;
	/**
	 * 打开主页
	 * @return  主页面
	 */
	@RequestMapping("/toIndex")
	public ModelAndView toIndex() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("index");
		return  mav;
	}
	/**
	 * 打开公司列表页面
	 * @return
	 */
	@RequestMapping("/toCompanyList")
	public ModelAndView toCompanyList() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("Company/companyList");
		return  mav;
	}
	/**
	 * 查询公司列表
	 * @return 表格结果集
	 */
	@RequestMapping(value="/findCompanyList", produces = "application/json;charset=utf-8")
	@ResponseBody
	public String findCompanyList(int page,int limit) {
		Map<String,Object> map=new HashMap<String, Object>();
		List<Map<String,Object>> list=companyService.findCompanyList(page, limit);
		int count=companyService.findCompanyCount();
		map.put("code", 0);
	  	map.put("msg", "");
	  	map.put("count", count);//总记录数,layui框架自动用于分页计算总页数
	  	map.put("data",list);//表格数据
	  	Gson g=new Gson();
	  System.out.println(g.toJson(map));
		return g.toJson(map);
	}
	/**
	 * 打开添加公司页面
	 * @return  添加公司页面
	 */
	@RequestMapping("/toAddCompany")
	public ModelAndView toAddCompany() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("Company/companyAdd");
		return  mav;
	}
	/**
	 * 添加公司
	 * @return 添加成功与否信息
	 */
	@RequestMapping(value="/addCompany", produces = "application/json;charset=utf-8")
	@ResponseBody
	public String addCompany() {
		DataStatus ds=new DataStatus();
		
		return ds.toGson(ds);
	}
	
}
