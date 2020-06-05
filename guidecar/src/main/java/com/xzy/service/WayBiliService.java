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
	public List<Map<String,Object>> findWayBiliList(int page,int limit,String wb_id,String name){
		//�Ѳ�ѯ����,��ҳ����,���򶼷�װ��map������
				HashMap<String, Object> map = new HashMap<String, Object>();
				map.put("pageSize", limit);
				map.put("start", (page-1)*limit);
				map.put("wb_id", wb_id);
				map.put("name", name);
				return  wayBiliDao.findWayBiliList(map);
	}
	
	/**
	 * ͳ��ȫ������
	 * @return ������
	 */
	public int findWayBiliCount() {
		return wayBiliDao.findWayBiliCount();
	}
	/**
	 * ��Ӷ���
	 * @param waybill
	 * @return
	 */
	public int addWayBill(WayBill waybill) {
		return wayBiliDao.addWayBill(waybill);
	}
	
	/**
	 * ����id��ѯ
	 * @param id
	 * @return
	 */
	public WayBill findWayBillById(int id) {
		return wayBiliDao.findWayBillById(id);
	}
	
	/**
	 * ����idɾ��
	 * @param id
	 * @return
	 */
	public int delWayBill(int id) {
		return wayBiliDao.delWayBill(id);
	}
	
	/**
	 * �޸Ķ���
	 * @param waybill
	 * @return
	 */
	public int updateWayBill(WayBill waybill) {
		return wayBiliDao.updateWayBill(waybill);
	}

}
