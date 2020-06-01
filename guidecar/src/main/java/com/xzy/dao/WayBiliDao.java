package com.xzy.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import com.xzy.entity.WayBill;

public interface WayBiliDao {
	
	
	/**
	 * 	查询订单列表
	 * @return  全部的订单信息
	 */
	List<Map<String,Object>> findWayBiliList(HashMap<String,Object> map);
	
	
	/**
	 * 查询全部订单条数
	 * @return
	 */
	int findWayBiliCount( );
	
	void addWayBill(WayBill waybill);
	
	
	
	
	
	
	

}
