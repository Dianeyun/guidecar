package com.xzy.controller;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
     
/**
 * ¹«Ë¾¿ØÖÆÆ÷
 * @author J¡¤Y
 *
 */

@Controller
@RequestMapping("company")
public class CompanyController {
	
	@RequestMapping("/toIndex")
	public String toCompanyIndex() {
		return "PlatformIndex";
	}
}
