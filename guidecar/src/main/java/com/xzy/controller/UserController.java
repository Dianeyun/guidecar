package com.xzy.controller;

import org.springframework.web.bind.annotation.RestController;
<<<<<<< HEAD



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

=======
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
>>>>>>> zhangyunjie
import org.springframework.web.servlet.ModelAndView;
import com.xzy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
<<<<<<< HEAD

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.ResponseBody;
import com.xzy.entity.User;
import com.xzy.entity.DataStatus;

@RestController
@RequestMapping("/user")
public class UserController {

=======
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import com.xzy.entity.User;
import com.xzy.entity.DataStatus;
@RestController
@RequestMapping("/user")
public class UserController {
>>>>>>> zhangyunjie
	@Autowired
	private UserService userservice;
	
	@RequestMapping("/toLogin")
	public ModelAndView toLogin() {
		ModelAndView mdv=new ModelAndView();
		mdv.setViewName("Login/login");
		return mdv;
		
	}
	/**
	 * ע��ҳ��
	 * @return
	 */
	@RequestMapping("/toA")
	public ModelAndView toA() {
		ModelAndView mdv2=new ModelAndView();
		mdv2.setViewName("Login/a");
		return mdv2;
	}
<<<<<<< HEAD
	

=======
>>>>>>> zhangyunjie
	@RequestMapping("/toIndex")
	public ModelAndView index() {
		ModelAndView mdv3=new ModelAndView();
		mdv3.setViewName("index");
		return mdv3;
	}
	/**
	 * 
	 * @param id 
	 * @return 
	 */
	@RequestMapping("/findById")
	@ResponseBody
	public User findById(int id) {
		return findById(id);
	}
	
	/**
	 * 
	 * @param username
	 * @return
	 */
	
	@RequestMapping("/findByUsername")
	@ResponseBody
	public User findByUsername(String username) {
		return userservice.findByUsername(username);
	}
	
	/**
	 * ע��
	 * @param user
	 */
	@RequestMapping("/findAdd")
	@ResponseBody
	public String findAdd(User user) {
		System.out.println(user);
		DataStatus ds=new DataStatus();
		int i=userservice.findAdd(user);
		if(i>0) {
			ds.setStatus("1");
			ds.setMsg("ע��ɹ�����");
		}else {
			ds.setStatus("0");
			ds.setMsg("ע��ʧ�ܣ���");
		}
		return ds.toGson(ds);
	}
	
	
	/**
	 * ��ѯ�û�id������
	 * @param name
	 * @param password
	 * @param model
	 * @return
	 */

	@RequestMapping(value="/login" ,produces="application/json;charset=utf-8")
	@ResponseBody
	public String login(@RequestParam("name") String name,@RequestParam("password")String password) {
<<<<<<< HEAD

=======
>>>>>>> zhangyunjie
		System.out.println(name+" "+password);
		User user=new User();
	    user.setName(name);
	    user.setPassword(password);
	    DataStatus ds=new DataStatus();
	    if(userservice.findByUsernameAndPwd(user) !=null) {
	    	/*model.addAttribute("name",name);
	    	mv.setViewName("index");*/
	    	ds.setStatus("1");
	    	ds.setMsg("��¼�ɹ�");
	   
	    }else {
	    	ds.setStatus("0");
	    	ds.setStatus("�˺Ż��������");
	    }
	    return ds.toGson(ds);
	}
	/**
	 * 
	 * @param user
	 */
	@RequestMapping("/update")
	@ResponseBody
	public void update(@RequestBody User user) {
		 userservice.update(user);
	}
	
<<<<<<< HEAD


=======
>>>>>>> zhangyunjie
	@RequestMapping("/login")
	@ResponseBody
	public void login(String name,String password,Model model) {
		//System.out.println("�û���¼��"+name+password);

	}
	
<<<<<<< HEAD
}
	
=======

}
>>>>>>> zhangyunjie
	

