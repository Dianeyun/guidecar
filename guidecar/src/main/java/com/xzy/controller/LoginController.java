package com.xzy.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

import com.xzy.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;
import com.xzy.entity.User;
import com.xzy.entity.DataStatus;

@RestController
@RequestMapping("/user")
public class LoginController {

	@Autowired
	private LoginService loginService;
	
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
		return loginService.findByUsername(username);
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
		int i=loginService.findAdd(user);
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
	    User  u=loginService.findByUsernameAndPwd(user); 
	    if(u!=null) {
	    	/*model.addAttribute("name",name);
	    	mv.setViewName("index");*/
	    	if(u.getType()==2) {
	    		ds.setStatus("2");
		    	ds.setMsg("登录成功");
		    	System.out.println("x"+u.getType());
	    	}else if(u.getType()==1) {
	    		ds.setStatus("1");
		    	ds.setMsg("登录成功");
		    	System.out.println("z"+u.getType());
	    	}else {
	    		ds.setStatus("0");
		    	ds.setMsg("登录成功");
		    	System.out.println("z"+u.getType());
	    	}
	    }else {
	    	ds.setStatus("-1");
	    	ds.setStatus("账号或密码错误！");
	    }
	    return ds.toGson(ds);
	}
	
	
}
	
	

