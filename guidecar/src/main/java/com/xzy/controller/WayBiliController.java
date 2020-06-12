package com.xzy.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import com.xzy.entity.WayBill;
import com.google.gson.Gson;
import com.xzy.entity.DataStatus;
import com.xzy.entity.Journal;
import com.xzy.entity.User;
import com.xzy.service.JournalService;
import com.xzy.service.WayBiliService;
@RestController
@RequestMapping("/waybili")
public class WayBiliController {
	
	@Autowired
	private WayBiliService wayBiliService;
	
	@Autowired
	private JournalService journalservice;
	
	
	/**
	 *�û�ҳ�� 
	 */
	@RequestMapping("/toUser")
	public ModelAndView toUser() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("User");
		return  mav;
	}
	
	/**
	 * ����ҳ��
	 * @return
	 */
	
	@RequestMapping("/toWayBiliList")
	public ModelAndView toWayBileList() {
		ModelAndView mav2=new ModelAndView();
		mav2.setViewName("WayBili/waybiliList");
		return mav2;
	}
	
	
	/**
	 * �ֿ�ҳ��
	 * @return
	 */
	@RequestMapping("/toWayBiliDepot")
	public ModelAndView toWayBiliDepot() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("WayBili/waybiliDepot");
		return mav;
	}
	
	  
	
	/**
	 * �޸�ҳ��
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping("/toWayBillUpdate")
	public ModelAndView toWayBillModify(int id,HttpServletRequest request) {
		WayBill waybill=wayBiliService.findWayBillById(id);
		System.out.println(waybill);
		request.setAttribute("waybill", waybill);
		ModelAndView mav3=new ModelAndView();
		mav3.setViewName("WayBili/waybiliUpdate");
		return mav3;
	}
	
	/**
	 * ����ǩ��ҳ��
	 * @return
	 */
	@RequestMapping("/toWayBiliSign")
	public ModelAndView toWayBiliSign() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("WayBili/waybiliSign");
		return mav;
	}
	
	
	
	
	
	
	/**
	 * ��ѯ�����б�
	 * @param page
	 * @param limit
	 * @return
	 */
	@RequestMapping(value="/findWayBiliList",produces="application/json;charset=utf-8")
	@ResponseBody
	public String findWayBiliList(int page, int limit,String wb_status,String wb_id,String name,HttpSession sess) {
		System.out.println(wb_status);
		User u=(User) sess.getAttribute("user");//��ȡsession �е�user
		int i=u.getCompany_id();
		Map<String,Object> map=new HashMap<String,Object>();
		List<Map<String,Object>> list=wayBiliService.findWayBiliList(page, limit,wb_status,i,wb_id,name);
		int count=wayBiliService.findWayBiliCount();
		map.put("code", 0);
		map.put("msg", 0);
		map.put("count", count);//�ܼ�¼��,layui����Զ����ڷ�ҳ������ҳ��
		map.put("data", list);//�������
		Gson g=new Gson();
		return g.toJson(map);
	}
	
	/**
	 * ��Ӷ���ҳ��
	 * @return
	 */
	@RequestMapping("/toAddWayBili")
	public ModelAndView toAddWayBili() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("WayBili/waybiliAdd");
		return  mav;
	}


	/**
	 * ��Ӷ�������
	 * @param waybill
	 * @param journal 
	 * @return
	 */
	@RequestMapping(value="/addWayBill",produces="application/json;charset=utf-8")
	@ResponseBody
	public String addMayBili(WayBill waybill,HttpSession sess) {
		User user=(User) sess.getAttribute("user");
		Journal journal=new Journal();
		journal.setOperTime(waybill.getRecordingtime());
		journal.setWbId(waybill.getWb_id());
		journal.setOperUser(user.getName());
		journal.setOperDapt(wayBiliService.deptNameByDeptId(user.getDept_id()));
		journal.setOperDesc("��Ӷ���");
		journal.setOperMenu("����");
		waybill.setCompany_id(user.getCompany_id());
		waybill.setDept(user.getDept_id()+"");
		int i=wayBiliService.addWayBill(waybill);
		DataStatus ds=new DataStatus(); 
		if(i>0) {
			ds.setStatus("1");
			ds.setMsg("��ӳɹ���");
			int j=journalservice.addJournal(journal);
			System.out.println("aaa"+i);
		}else {
			ds.setStatus("0");
			ds.setMsg("���ʧ��");
		}
		return ds.toGson(ds);
		
	}
	
	
	/**
	 * ����idɾ��
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/delWayBill",produces="application/json;charset=utf-8")
	@ResponseBody
	public String delWayBill(int id,HttpSession sess) {
		User  user= (User) sess.getAttribute("user");
		WayBill waybill=new WayBill();
		Journal journal=new Journal();
		journal.setOperTime(waybill.getRecordingtime());
		journal.setWbId(waybill.getWb_id());
		journal.setOperUser(user.getName());
		journal.setOperDapt(wayBiliService.deptNameByDeptId(user.getDept_id()));
		journal.setOperDesc("ɾ������");
		journal.setOperMenu("ɾ��");
		int i=wayBiliService.delWayBill(id);
		DataStatus ds=new DataStatus();
		if(i>0) {
			ds.setStatus("1");
			ds.setMsg("ɾ���ɹ�");
			int j=journalservice.addJournal(journal);
		}else {
			ds.setStatus("0");
			ds.setMsg("ɾ��ʧ��");
		}

		return ds.toGson(ds);
	}
	


	
	/**
	 * �޸Ķ���
	 * @param waybill
	 * @return
	 */
	@RequestMapping(value="/updateWayBill",produces="application/json;charset=utf-8")
	@ResponseBody
	public String updateWayBill(WayBill waybill,HttpSession sess) {
		User user=(User) sess.getAttribute("user");
		Journal journal=new Journal();
		journal.setOperTime(waybill.getRecordingtime());//��ȡ����ʱ��
		journal.setWbId(waybill.getWb_id());//��ȡ������
		journal.setOperUser(user.getName());//��ȡ����������
		journal.setOperDapt(wayBiliService.deptNameByDeptId(user.getDept_id()));//��ȡ����
		journal.setOperDesc("�޸Ķ���");
		journal.setOperMenu("�޸�");
		int i=wayBiliService.updateWayBill(waybill);
		DataStatus ds=new DataStatus();
		if(i>0) {
			ds.setStatus("1");
			ds.setMsg("�޸ĳɹ�");
			int j=journalservice.addJournal(journal);
		}else {
			ds.setStatus("0");
			ds.setMsg("�޸�ʧ��");
		}
		return ds.toGson(ds);
	}
	
	@RequestMapping(value="/updateStatus",produces="application/json;charset=utf-8")
	@ResponseBody
	public String updateStatus(WayBill waybill,HttpSession sess) {
		User user=(User) sess.getAttribute("user");
		Journal journal=new Journal();
		journal.setOperTime(waybill.getRecordingtime());
		journal.setWbId(waybill.getWb_id());
		journal.setOperUser(user.getName());
		journal.setOperDapt(wayBiliService.deptNameByDeptId(user.getDept_id()));
		journal.setOperDesc("�޸Ķ���");
		
		
		
		int i=0;
		//waybill.setWb_status(waybill.getWb_status()+1);//��ȡWb_status��ֵ��һ ������ӵ�ʵ����
	    if("���".equals(waybill.getWb_status())) {
	    	waybill.setWb_status("��;");
	    	journal.setOperMenu("����");
	    	i=wayBiliService.updateStatus(waybill);
	    	int j=journalservice.addJournal(journal);
	    }else if("��;".equals(waybill.getWb_status())){
	    	waybill.setWb_status("ǩ��");
	    	journal.setOperMenu("ǩ��");
	    	i=wayBiliService.updateStatus(waybill);
	    	int j=journalservice.addJournal(journal);
	    }else if("ǩ��".equals(waybill.getWb_status())) {
	    	waybill.setWb_status("��ǩ��");
	    	i=wayBiliService.updateStatus(waybill);
	    }
	    DataStatus ds=new DataStatus();
	     if(i>0) {
	    	     ds.setStatus("1");
				ds.setMsg("�޸ĳɹ�");
				
	     }else {
	    	    ds.setStatus("1");
				ds.setMsg("�޸ĳɹ�");

				
	     }
	    
	     return  ds.toGson(ds);
	     
	     
	}
	
	
	
}
