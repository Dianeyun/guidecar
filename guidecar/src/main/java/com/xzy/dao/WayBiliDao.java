package com.xzy.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import com.xzy.entity.WayBill;

public interface WayBiliDao {
	
	
	/**
	 * 	��ѯ�����б�
	 * @return  ȫ���Ķ�����Ϣ
	 */
	List<Map<String,Object>> findWayBiliList(HashMap<String,Object> map);
	
	
	/**
	 * ��ѯȫ����������
	 * @return
	 */
	int findWayBiliCount( );
	
	void addWayBill(WayBill waybill);
	
	
	
	
	
	
	

}
