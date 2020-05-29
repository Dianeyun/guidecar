package com.xzy.controller;

import org.springframework.web.bind.annotation.RestController;
<<<<<<< HEAD
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestMapping;
=======






=======
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
import org.springframework.web.servlet.ModelAndView;

import com.xzy.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xzy.entity.DataStatus;
=======
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
import com.xzy.entity.User;



<<<<<<< HEAD
>>>>>>> yq



@RestController
@RequestMapping("/user")
public class UserController {
<<<<<<< HEAD
	
	
=======
=======
@RestController
@RequestMapping("/user")
public class UserController {
	
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
	@Autowired
	private UserService userservice;
	
	@RequestMapping("/toLogin")
	public ModelAndView toLogin() {
		ModelAndView mdv=new ModelAndView();
		mdv.setViewName("Login/login");
		return mdv;
		
	}
	/**
	 * ×¢²áÒ³Ãæ
	 * @return
	 */
	@RequestMapping("/toA")
	public ModelAndView toA() {
		ModelAndView mdv2=new ModelAndView();
		mdv2.setViewName("Login/a");
		return mdv2;
	}
	
<<<<<<< HEAD
	@RequestMapping("/toIndex")
	public ModelAndView index() {
		ModelAndView mdv3=new ModelAndView();
		mdv3.setViewName("index");
		return mdv3;
	}
	
	
=======
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
     
	
	
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
<<<<<<< HEAD
	 * ×¢²á
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
			ds.setMsg("×¢²á³É¹¦£¡£¡");
		}else {
			ds.setStatus("0");
			ds.setMsg("×¢²áÊ§°Ü£¡£¡");
		}
		return ds.toGson(ds);
	}
	
	
	/**
	 * ²éÑ¯ÓÃ»§idºÍÃÜÂë
	 * @param name
	 * @param password
	 * @param model
	 * @return
	 */

	@RequestMapping(value="/login" ,produces="application/json;charset=utf-8")
	@ResponseBody
	public String login(@RequestParam("name") String name,@RequestParam("password")String password) {
	    User user=new User();
	    user.setName(name);
	    user.setPassword(password);
	    DataStatus ds=new DataStatus();
	    if(userservice.findByUsernameAndPwd(user) !=null) {
	    	/*model.addAttribute("name",name);
	    	mv.setViewName("index");*/
	    	ds.setStatus("1");
	    	ds.setMsg("µÇÂ¼³É¹¦");
	   
	    }else {
	    	ds.setStatus("0");
	    	ds.setStatus("ÕËºÅ»òÃÜÂë´íÎó£¡");
	    }
	    return ds.toGson(ds);
	    
=======
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
		//System.out.println("ÓÃ»§µÇÂ¼£º"+name+password);
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
	}
	
	
	
<<<<<<< HEAD

	
>>>>>>> yq
	
=======
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
	
	
	

	
}
