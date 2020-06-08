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
import com.xzy.entity.User;
import com.xzy.service.WayBiliService;
@RestController
@RequestMapping("/waybili")
public class WayBiliController {
	
	@Autowired
	private WayBiliService wayBiliService;
	
	
	/**
	 *用户页面 
	 */
	@RequestMapping("/toUser")
	public ModelAndView toUser() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("User");
		return  mav;
	}
	
	/**
	 * 订单页面
	 * @return
	 */
	
	@RequestMapping("/toWayBiliList")
	public ModelAndView toWayBileList() {
		ModelAndView mav2=new ModelAndView();
		mav2.setViewName("WayBili/waybiliList");
		return mav2;
	}
	
	
	/**
	 * 仓库页面
	 * @return
	 */
	@RequestMapping("/toWayBiliDepot")
	public ModelAndView toWayBiliDepot() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("WayBili/waybiliDepot");
		return mav;
	}
	
	  
	
	/**
	 * 修改页面
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
	 * 订单签收页面
	 * @return
	 */
	@RequestMapping("/toWayBiliSign")
	public ModelAndView toWayBiliSign() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("WayBili/waybiliSign");
		return mav;
	}
	
	
	
	
	
	
	/**
	 * 查询订单列表
	 * @param page
	 * @param limit
	 * @return
	 */
	@RequestMapping(value="/findWayBiliList",produces="application/json;charset=utf-8")
	@ResponseBody
	public String findWayBiliList(int page, int limit,String wb_status,String wb_id,String name,HttpSession sess) {
		User u=(User) sess.getAttribute("user");//获取session 中的user
		int i=u.getCompany_id();
		Map<String,Object> map=new HashMap<String,Object>();
		List<Map<String,Object>> list=wayBiliService.findWayBiliList(page, limit,wb_status,i,wb_id,name);
		int count=wayBiliService.findWayBiliCount();
		map.put("code", 0);
		map.put("msg", 0);
		map.put("count", count);//总记录数,layui框架自动用于分页计算总页数
		map.put("data", list);//表格数据
		Gson g=new Gson();
		return g.toJson(map);
	}
	
	/**
	 * 添加订单页面
	 * @return
	 */
	@RequestMapping("/toAddWayBili")
	public ModelAndView toAddWayBili() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("WayBili/waybiliAdd");
		return  mav;
	}


	/**
	 * 添加订单数据
	 * @param waybill
	 * @return
	 */
	@RequestMapping(value="/addWayBill",produces="application/json;charset=utf-8")
	@ResponseBody
	public String addMayBili(WayBill waybill) {
		System.out.println("qwe"+waybill);
		int i=wayBiliService.addWayBill(waybill);
		DataStatus ds=new DataStatus();
		if(i>0) {
			ds.setStatus("1");
			ds.setMsg("添加成功！");
		}else {
			ds.setStatus("0");
			ds.setMsg("添加失败");
		}
		return ds.toGson(ds);
		
	}
	
	
	/**
	 * 根据id删除
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/delWayBill",produces="application/json;charset=utf-8")
	@ResponseBody
	public String delWayBill(int id) {
		int i=wayBiliService.delWayBill(id);
		DataStatus ds=new DataStatus();
		if(i>0) {
			ds.setStatus("1");
			ds.setMsg("删除成功");
		}else {
			ds.setStatus("0");
			ds.setMsg("删除失败");
		}

		return ds.toGson(ds);
	}
	


	
	/**
	 * 修改订单
	 * @param waybill
	 * @return
	 */
	@RequestMapping(value="/updateWayBill",produces="application/json;charset=utf-8")
	@ResponseBody
	public String updateWayBill(WayBill waybill) {
		int i=wayBiliService.updateWayBill(waybill);
		DataStatus ds=new DataStatus();
		if(i>0) {
			ds.setStatus("1");
			ds.setMsg("修改成功");
		}else {
			ds.setStatus("0");
			ds.setMsg("修改失败");
		}
		return ds.toGson(ds);
	}
	
	@RequestMapping(value="/updateStatus",produces="application/json;charset=utf-8")
	@ResponseBody
	public String updateStatus(WayBill waybill) {
		int i=0;
		//waybill.setWb_status(waybill.getWb_status()+1);//获取Wb_status的值加一 重新添加到实体类
	    if("入库".equals(waybill.getWb_status())) {
	    	waybill.setWb_status("在途");
	    	i=wayBiliService.updateStatus(waybill);
	    }else if("在途".equals(waybill.getWb_status())){
	    	waybill.setWb_status("签收");
	    	i=wayBiliService.updateStatus(waybill);
	    }else if("签收".equals(waybill.getWb_status())) {
	    	waybill.setWb_status("已签收");
	    	i=wayBiliService.updateStatus(waybill);
	    }
	    DataStatus ds=new DataStatus();
	     if(i>0) {
	    	     ds.setStatus("1");
				ds.setMsg("修改成功");
	     }else {
	    	    ds.setStatus("1");
				ds.setMsg("修改成功");
	     }
	     
	     return  ds.toGson(ds);
	     
	     
	}
	
	
	
	
	
	
}
