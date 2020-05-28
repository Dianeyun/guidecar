package com.xzy.controller;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xzy.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.xzy.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;




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
	 * ×¢²áÒ³Ãæ
	 * @return
	 */
	@RequestMapping("/toA")
	public ModelAndView toA() {
		ModelAndView mdv2=new ModelAndView();
		mdv2.setViewName("Login/a");
		return mdv2;
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
	}
	

	
	
	
	
	

	
}
