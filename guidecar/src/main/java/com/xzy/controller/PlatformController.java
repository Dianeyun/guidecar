package com.xzy.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.google.gson.Gson;
import com.xzy.entity.Company;
import com.xzy.entity.DataStatus;
import com.xzy.service.CompanyService;
/**
 * ƽ̨������
 * @author J��Y
 *
 */

@Controller
@RequestMapping("/platform")
public class PlatformController {
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
	@RequestMapping(value="/companyDel", produces = "application/json;charset=utf-8")
	@ResponseBody
	public String delCompany(int id) {
		int i=companyService.delCompany(id);
		DataStatus ds=new DataStatus();
		if(i>0) {
			ds.setStatus("1");
			ds.setMsg("ɾ���ɹ�����");
		}else{
			ds.setStatus("0");
			ds.setMsg("ɾ��ʧ�ܣ���");
		}
		return ds.toGson(ds);
	}
	/**
	 * ���޸Ĺ�˾ҳ��
	 * @param id ��˾idֵ
	 * @return ��Ҫ�޸ĵĹ�˾����Ϣ���޸�ҳ��
	 */
	@RequestMapping("/toCompanyModify")
	public ModelAndView toCompanyModify(int id,HttpServletRequest request) {
		Company company=companyService.findCompanyById(id);
		request.setAttribute("company", company);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Company/companyModify");
		return mv;
	}
	/**
	 * �޸Ĺ�˾
	 * @param company ��Ҫ�޸Ĺ�˾����Ϣ
	 * @return  1-�ɹ�  0-ʧ��
	 */
	@RequestMapping(value="/companyModify", produces = "application/json;charset=utf-8")
	@ResponseBody
	public String CompanyModify(Company company) {
		int i=companyService.companyModify(company);
		DataStatus ds=new DataStatus();
		if(i>0) {
			ds.setStatus("1");
			ds.setMsg("�޸ĳɹ�");
		}else{
			ds.setStatus("0");
			ds.setMsg("�޸�ʧ��");
		}
		return ds.toGson(ds);
	}
}
