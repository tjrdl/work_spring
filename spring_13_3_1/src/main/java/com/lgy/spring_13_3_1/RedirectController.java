package com.lgy.spring_13_3_1;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {
	@RequestMapping("/studentConfirm")
	public String studentRedirect(HttpServletRequest httpServletRequest) {
		String id = httpServletRequest.getParameter("id");
		if(id.equals("abc")) {
			return "redirect:studentOk";
		}
		return "redirect:studentNg";
	}
	
	@RequestMapping("/studentOk")
	public String studentOk() {
		return "student/studentOk";
	}
	@RequestMapping("/studentNg")
	public String studentNg() {
		return "student/studentNg";
	}
	
}
