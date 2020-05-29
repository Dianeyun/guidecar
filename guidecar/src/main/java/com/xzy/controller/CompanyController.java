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
 * ��˾������
 * @author J��Y
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
	 * ����ҳ
	 * @return  ��ҳ��
	 */
	@RequestMapping("/toIndex")
	public ModelAndView toIndex() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("index");
		return  mav;
	}
	/**
	 * �򿪹�˾�б�ҳ��
	 * @return
	 */
	@RequestMapping("/toCompanyList")
	public ModelAndView toCompanyList() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("Company/companyList");
		return  mav;
	}
	/**
	 * ��ѯ��˾�б�
	 * @return �������
	 */
	@RequestMapping(value="/findCompanyList", produces = "application/json;charset=utf-8")
	@ResponseBody
	public String findCompanyList(int page,int limit) {
		Map<String,Object> map=new HashMap<String, Object>();
		List<Map<String,Object>> list=companyService.findCompanyList(page, limit);
		int count=companyService.findCompanyCount();
		map.put("code", 0);
	  	map.put("msg", "");
	  	map.put("count", count);//�ܼ�¼��,layui����Զ����ڷ�ҳ������ҳ��
	  	map.put("data",list);//�������
	  	Gson g=new Gson();
	  System.out.println(g.toJson(map));
		return g.toJson(map);
	}
	/**
	 * ����ӹ�˾ҳ��
	 * @return  ��ӹ�˾ҳ��
	 */
	@RequestMapping("/toAddCompany")
	public ModelAndView toAddCompany() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("Company/companyAdd");
		return  mav;
	}
	/**
	 * ��ӹ�˾
	 * @return ��ӳɹ������Ϣ
	 */
	@RequestMapping(value="/addCompany", produces = "application/json;charset=utf-8")
	@ResponseBody
	public String addCompany() {
		DataStatus ds=new DataStatus();
		
		return ds.toGson(ds);
	}
	
}
