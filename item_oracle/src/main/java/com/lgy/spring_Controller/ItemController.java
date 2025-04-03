package com.lgy.spring_Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lgy.spring_Service.ItemContentService;
import com.lgy.spring_Service.ItemService;
import com.lgy.spring_Service.ItemWriteService;

import lombok.extern.slf4j.Slf4j;
@Controller
@Slf4j

public class ItemController {
	ItemService service;
	
	@RequestMapping("/list")
	public String list(Model model) {
		log.info("list");
		service = new ItemContentService();
		service.excute(model);
		
		return "list";
	}
	
	@RequestMapping("/write")
	public String write(HttpServletRequest request, Model model) {
		log.info("item_write");
		model.addAttribute("request",request);
		
		service = new ItemWriteService();
		service.excute(model);
		
		return "write_result";
	}
	@RequestMapping("/write_result")
	public String write_result() {
		log.info("write_result");
		return "write_result";
	}
	
	
}
