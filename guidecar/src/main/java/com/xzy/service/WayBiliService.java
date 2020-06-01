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
	 * ��ѯ�����б�
	 * @param page ��ʼ����
	 * @param limit ÿҳ��ʾ����
	 * @return
	 */
	public List<Map<String,Object>> findWayBiliList(int page,int limit){
		//�Ѳ�ѯ����,��ҳ����,���򶼷�װ��map������
				HashMap<String, Object> map = new HashMap<String, Object>();
				map.put("pageSize", limit);
				map.put("start", (page-1)*limit);
				return  wayBiliDao.findWayBiliList(map);
	}
	
	/**
	 * ͳ��ȫ������
	 * @return ������
	 */
	public int findWayBiliCount() {
		return wayBiliDao.findWayBiliCount();
	}
	
	public void addWayBill(WayBill  waybill) {
		wayBiliDao.addWayBill(waybill);
		
	}
	
	
	
	

	
	
	

}
