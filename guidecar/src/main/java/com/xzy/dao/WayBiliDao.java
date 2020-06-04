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

	/**
	 * 添加订单
	 * @param waybill
	 */
	int addWayBill(WayBill waybill);
	
	
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	WayBill findWayBillById(int id);
	
	
	/**
	 * 根据id删除
	 * @param id
	 * @return
	 */
	int delWayBill(int id);
	
	
	/**
	 * 修改订单
	 * @param waybill
	 * @return
	 */
	int updateWayBill(WayBill waybill);


	
	
	
	
	
	
	

}
