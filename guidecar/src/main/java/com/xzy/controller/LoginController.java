package com.xzy.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;

import com.xzy.service.CompanyService;
import com.xzy.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;
import com.xzy.entity.User;
import com.xzy.entity.Company;
import com.xzy.entity.DataStatus;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private LoginService loginService;
	@Autowired
	private CompanyService companyService;
	
	@RequestMapping("/toLogin")
	public ModelAndView toLogin() {
		ModelAndView mdv=new ModelAndView();
		mdv.setViewName("Login/login");
		System.out.println("11");
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
	 * ÐÞ¸ÄÃÜÂëÒ³Ãæ
	 * @return
	 */
	@RequestMapping("/tochange")
		public ModelAndView tochange() {
			ModelAndView mdv=new ModelAndView();
			mdv.setViewName("Login/change");
			return mdv ;
		}
	
	

	@RequestMapping("/toIndex")
	public ModelAndView index() {
		ModelAndView mdv3=new ModelAndView();
		mdv3.setViewName("PlatformIndex");
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
	 * ×¢²á
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
	public String login(@RequestParam("name") String name,@RequestParam("password")String password,HttpSession sess) {
		
		System.out.println(name+" "+password);
		User user=new User();
	    user.setName(name);
	    user.setPassword(password);
	    DataStatus ds=new DataStatus();
	    User u=loginService.findByUsernameAndPwd(user);
	    int id=u.getCompany_id();
	   Company company= companyService.findCompanyById(id);
	    if(u!=null) { 
	    	/*model.addAttribute("name",name);
	    	mv.setViewName("index");*/
	    	sess.setAttribute("user",u);
	    	sess.setAttribute("company",company);
	    	if(u.getType()==2) {
	    		ds.setStatus("2");
		    	ds.setMsg("µÇÂ¼³É¹¦");
	    	}else if(u.getType()==1) {
	    		ds.setStatus("1");
		    	ds.setMsg("µÇÂ¼³É¹¦");
	    	}else {
	    		ds.setStatus("0");
		    	ds.setMsg("µÇÂ¼³É¹¦");
	    	}
	    }else {
	    	ds.setStatus("-1");
	    	ds.setStatus("ÕËºÅ»òÃÜÂë´íÎó£¡");
	    }
	   
	    return ds.toGson(ds);
	}
	
	
	/**
	 * ÐÞ¸ÄÃÜÂë
	 * @param phone
	 * @param password
	 * @return
	 */
	@RequestMapping(value="/modifyPasswordByPhone",produces="application/json;charset=utf-8")
	@ResponseBody
	public String modifyPasswordByPhone(@RequestParam("phone") String phone,@RequestParam("password") String password) {
		int i =loginService.modifyPasswordByPhone(phone,password);
		DataStatus ds=new DataStatus();
		if(i>0) {
			ds.setStatus("1");
			ds.setMsg("ÐÞ¸Ä³É¹¦");
		}else {
			ds.setStatus("0");
			ds.setMsg("ÐÞ¸ÄÊ§°Ü");
		}
		return ds.toGson(ds);
		
	}
	
	
	/**
	 * ÍË³öÉ¾³ýsession
	 * @param request
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping(value="/logout")
	public ModelAndView logout(HttpServletRequest request) throws IOException {
		ModelAndView mav=new ModelAndView();
		HttpSession session=request.getSession();
		session.removeAttribute("user");
		mav.setViewName("Login/login");
		return mav;
	}
	
	
	
}
	
	

