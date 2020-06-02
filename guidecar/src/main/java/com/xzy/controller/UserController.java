package com.xzy.controller;

import org.springframework.web.bind.annotation.RestController;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

import com.xzy.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.ResponseBody;
import com.xzy.entity.User;
import com.xzy.entity.DataStatus;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userservice;
	
	@RequestMapping("/toLogin")
	public ModelAndView toLogin() {
		ModelAndView mdv=new ModelAndView();
		mdv.setViewName("Login/login");
		return mdv;
		
	}
	/**
	 * 注册页面
	 * @return
	 */
	@RequestMapping("/toA")
	public ModelAndView toA() {
		ModelAndView mdv2=new ModelAndView();
		mdv2.setViewName("Login/a");
		return mdv2;
	}
	

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
	 * 注册
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
			ds.setMsg("注册成功！！");
		}else {
			ds.setStatus("0");
			ds.setMsg("注册失败！！");
		}
		return ds.toGson(ds);
	}
	
	
	/**
	 * 查询用户id和密码
	 * @param name
	 * @param password
	 * @param model
	 * @return
	 */

	@RequestMapping(value="/login" ,produces="application/json;charset=utf-8")
	@ResponseBody
	public String login(@RequestParam("name") String name,@RequestParam("password")String password) {

		System.out.println(name+" "+password);
		User user=new User();
	    user.setName(name);
	    user.setPassword(password);
	    DataStatus ds=new DataStatus();
	    if(userservice.findByUsernameAndPwd(user) !=null) {
	    	/*model.addAttribute("name",name);
	    	mv.setViewName("index");*/
	    	ds.setStatus("1");
	    	ds.setMsg("登录成功");
	   
	    }else {
	    	ds.setStatus("0");
	    	ds.setStatus("账号或密码错误！");
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
	


	@RequestMapping("/login")
	@ResponseBody
	public void login(String name,String password,Model model) {
		//System.out.println("用户登录："+name+password);

	}
	
}
	
	

