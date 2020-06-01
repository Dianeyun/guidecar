package com.xzy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import java.util.HashMap;
import java.util.Map;
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
	
	
	@RequestMapping(value="/addWaBili",produces="application/json;charset=utf-8")
	@ResponseBody
	public String addMayBili(WayBill waybill) {
		
		DataStatus ds=new DataStatus();
		
		return ds.toGson(ds);
	}
	
	
	
	
	

}
