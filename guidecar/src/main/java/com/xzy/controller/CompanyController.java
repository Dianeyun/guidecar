package com.xzy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ¹«Ë¾¿ØÆ÷Æ÷
 * @author J¡¤Y
 *
 */

@Controller
@RequestMapping("/company")
public class CompanyController {
	
	@RequestMapping("/toIndex")
	public String toCompanyIndex() {
		return "PlatformIndex";
	}
	
}
