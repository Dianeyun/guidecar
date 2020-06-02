package com.xzy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
<<<<<<< HEAD
<<<<<<< HEAD
=======


import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
>>>>>>> zhangyunjie

import java.util.HashMap;
import java.util.Map;

<<<<<<< HEAD
import javax.servlet.http.HttpServletRequest;
=======
import java.util.HashMap;
import java.util.Map;
>>>>>>> bea4996526394f6440a7c03c25b825957a3cb83d
=======
>>>>>>> zhangyunjie
import java.util.List;
import com.xzy.entity.WayBill;


import com.google.gson.Gson;
import com.xzy.entity.DataStatus;
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
	
<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> zhangyunjie
	/**
	 * 修改页面
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping("/toWayBillModify")
	public ModelAndView toWayBillModify(int id,HttpServletRequest request) {
		WayBill waybill=wayBiliService.findWayBillById(id);
		request.setAttribute("waybili", waybill);
		ModelAndView mav3=new ModelAndView();
		mav3.setViewName("WayBili/waybiliModify");
		return mav3;
	}
	
	
	
	/**
	 * 查询订单列表
	 * @param page
	 * @param limit
	 * @return
	 */
<<<<<<< HEAD
=======
	
	
>>>>>>> bea4996526394f6440a7c03c25b825957a3cb83d
=======
>>>>>>> zhangyunjie
	@RequestMapping(value="/findWayBiliList",produces="application/json;charset=utf-8")
	@ResponseBody
	public String findWayBiliList(int page, int limit) {
		Map<String,Object> map=new HashMap<String,Object>();
		List<Map<String,Object>> list=wayBiliService.findWayBiliList(page, limit);
		int count=wayBiliService.findWayBiliCount();
		map.put("code", 0);
		map.put("msg", 0);
		map.put("count", count);//总记录数,layui框架自动用于分页计算总页数
		map.put("data", list);//表格数据
		Gson g=new Gson();
		System.out.println(g.toJson(map));
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
	
<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> zhangyunjie

	/**
	 * 添加订单数据
	 * @param waybill
	 * @return
	 */
	@RequestMapping(value="/addWayBill",produces="application/json;charset=utf-8")
	@ResponseBody
	public String addMayBili(WayBill waybill) {
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
<<<<<<< HEAD
	

=======
=======

>>>>>>> zhangyunjie
	
	@RequestMapping(value="/addWaBili",produces="application/json;charset=utf-8")
	@ResponseBody
	public String addMayBili(WayBill waybill) {
		
		DataStatus ds=new DataStatus();
		
		return ds.toGson(ds);
	}
	
	
	
<<<<<<< HEAD
>>>>>>> bea4996526394f6440a7c03c25b825957a3cb83d
	
	
=======
>>>>>>> zhangyunjie

}
