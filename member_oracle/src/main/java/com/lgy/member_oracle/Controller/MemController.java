package com.lgy.member_oracle.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lgy.member_oracle.Service.MemLoginService;
import com.lgy.member_oracle.Service.MemService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MemController {
	MemService service;
	
	@RequestMapping("/login")
	public String login(Model model) {
		/*
		 * log.info("@# login");
		 * 
		 * service = new MemLoginService(); service.excute(model);
		 */
		
		return "login";
	}
	
	
	@RequestMapping("/login_ok")
	public String login_ok(HttpServletRequest request, Model model) {

		log.info("@# login_ok");
		model.addAttribute("request",request);
		service = new MemLoginService();
		int res = service.excute(model);
		
		if(res==1) {
			return "login_ok";
			
		}
		else {
		return "login";
		}
	}
}
