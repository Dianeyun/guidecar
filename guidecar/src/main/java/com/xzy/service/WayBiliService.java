package com.xzy.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xzy.dao.WayBiliDao;
import com.xzy.entity.WayBill;

@Service
public class WayBiliService {
	
	@Autowired
	private WayBiliDao wayBiliDao;
	
	/**
	 * 查询订单列表
	 * @param page 起始条数
	 * @param limit 每页显示几条
	 * @return
	 */
	public List<Map<String,Object>> findWayBiliList(int page,int limit){
		//把查询条件,分页条件,排序都封装在map对象中
				HashMap<String, Object> map = new HashMap<String, Object>();
				map.put("pageSize", limit);
				map.put("start", (page-1)*limit);
				return  wayBiliDao.findWayBiliList(map);
	}
	
	/**
	 * 统计全部订单
	 * @return 总条数
	 */
	public int findWayBiliCount() {
		return wayBiliDao.findWayBiliCount();
	}
	
	public void addWayBill(WayBill  waybill) {
		wayBiliDao.addWayBill(waybill);
		
	}
	
	
	
	

	
	
	

}
