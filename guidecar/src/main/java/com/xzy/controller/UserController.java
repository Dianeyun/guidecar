package com.xzy.controller;

import org.springframework.web.bind.annotation.RestController;
<<<<<<< HEAD
<<<<<<< HEAD



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

=======
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
>>>>>>> zhangyunjie
=======
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
=======
<<<<<<< HEAD

import org.springframework.web.bind.annotation.RequestMapping;
=======
<<<<<<< HEAD
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestMapping;
=======






=======
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
>>>>>>> d75f37ac26b1671ae3b85d3716fd4ea6959e117a
>>>>>>> zhangyunjie
import org.springframework.web.servlet.ModelAndView;
import com.xzy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
<<<<<<< HEAD
<<<<<<< HEAD

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.ResponseBody;
import com.xzy.entity.User;
import com.xzy.entity.DataStatus;
=======
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.xzy.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;



=======
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


>>>>>>> d75f37ac26b1671ae3b85d3716fd4ea6959e117a
>>>>>>> zhangyunjie

@RestController
@RequestMapping("/user")
public class UserController {
<<<<<<< HEAD

=======
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import com.xzy.entity.User;
import com.xzy.entity.DataStatus;
@RestController
@RequestMapping("/user")
public class UserController {
>>>>>>> zhangyunjie
=======
<<<<<<< HEAD
	
=======
<<<<<<< HEAD
	
	
=======
=======
@RestController
@RequestMapping("/user")
public class UserController {
	
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
>>>>>>> d75f37ac26b1671ae3b85d3716fd4ea6959e117a
>>>>>>> a7828c9b350017c79b65171db32dcad3185a020f
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
<<<<<<< HEAD
	

=======
>>>>>>> zhangyunjie
=======
=======
	
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> a7828c9b350017c79b65171db32dcad3185a020f
>>>>>>> zhangyunjie
	@RequestMapping("/toIndex")
	public ModelAndView index() {
		ModelAndView mdv3=new ModelAndView();
		mdv3.setViewName("index");
		return mdv3;
	}
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
	
	
=======
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
>>>>>>> d75f37ac26b1671ae3b85d3716fd4ea6959e117a
     
	
	
>>>>>>> a7828c9b350017c79b65171db32dcad3185a020f
>>>>>>> zhangyunjie
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
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> a7828c9b350017c79b65171db32dcad3185a020f
>>>>>>> zhangyunjie
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
<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> zhangyunjie
		System.out.println(name+" "+password);
		User user=new User();
=======
		System.out.println(name+" "+password);
		User user=new User();
=======
	    User user=new User();
>>>>>>> a7828c9b350017c79b65171db32dcad3185a020f
>>>>>>> zhangyunjie
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
<<<<<<< HEAD
	}
	/**
=======
<<<<<<< HEAD
	}
	/**
=======
	    
=======
>>>>>>> d75f37ac26b1671ae3b85d3716fd4ea6959e117a
>>>>>>> a7828c9b350017c79b65171db32dcad3185a020f
>>>>>>> zhangyunjie
	 * 
	 * @param user
	 */
	@RequestMapping("/update")
	@ResponseBody
	public void update(@RequestBody User user) {
<<<<<<< HEAD
		 userservice.update(user);
	}
	
<<<<<<< HEAD


=======
>>>>>>> zhangyunjie
=======
<<<<<<< HEAD
		 userservice.update(user);
=======
		userservice.update(user);
>>>>>>> a7828c9b350017c79b65171db32dcad3185a020f
	}
	
>>>>>>> zhangyunjie
	@RequestMapping("/login")
	@ResponseBody
	public void login(String name,String password,Model model) {
		//System.out.println("ÓÃ»§µÇÂ¼£º"+name+password);
<<<<<<< HEAD

=======
<<<<<<< HEAD

	}
	

}
	

=======
<<<<<<< HEAD
>>>>>>> zhangyunjie
	}
	
<<<<<<< HEAD
<<<<<<< HEAD
}
	
=======

}
>>>>>>> zhangyunjie
=======

	
>>>>>>> yq
	
=======
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
>>>>>>> d75f37ac26b1671ae3b85d3716fd4ea6959e117a
	
>>>>>>> zhangyunjie
	

<<<<<<< HEAD
=======
	
}
>>>>>>> a7828c9b350017c79b65171db32dcad3185a020f
>>>>>>> zhangyunjie
