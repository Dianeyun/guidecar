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
<<<<<<< HEAD
	public String addCompany() {
=======
<<<<<<< HEAD
	public String addCompany(Company company) {
		
=======
<<<<<<< HEAD
	public String addCompany(Company company) {
		//System.out.println(company);
		company.setComnumber((int)((Math.random()*9+1)*1000));
		int i=companyService.addCompany(company);
		DataStatus ds=new DataStatus();
		if(i>0) {
			ds.setStatus("1");
			ds.setMsg("��ӳɹ�����");
		}else{
			ds.setStatus("0");
			ds.setMsg("���ʧ�ܣ���");
		}
		return ds.toGson(ds);
	}
	/**
	 * ɾ����˾������
	 * @param id ��˾id
	 * @return  ɾ���ɹ������Ϣ
	 */
	public String delCompany(int id) {
		DataStatus ds=new DataStatus();
		if(1=1) {
			ds.setStatus("1");
			ds.setMsg("ɾ���ɹ�����");
		}else{
			ds.setStatus("0");
			ds.setMsg("ɾ��ʧ�ܣ���");
		}
		return ds.toGson(ds);
	}
=======
	public String addCompany() {
>>>>>>> zhangyunjie
>>>>>>> d47052da0dd85e409feae8f7ffd0417c82ba2fe8
		DataStatus ds=new DataStatus();
		
		return ds.toGson(ds);
	}
	
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> d75f37ac26b1671ae3b85d3716fd4ea6959e117a
>>>>>>> zhangyunjie
>>>>>>> d47052da0dd85e409feae8f7ffd0417c82ba2fe8
}
