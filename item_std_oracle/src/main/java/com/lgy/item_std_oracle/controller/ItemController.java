package com.lgy.item_std_oracle.controller;

import java.util.ArrayList;
import java.util.HashMap;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lgy.item_std_oracle.dto.itemDTO;
import com.lgy.item_std_oracle.service.ItemService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ItemController {
	@Autowired
	private ItemService service;
	
	@RequestMapping("content_view")
	public String content_view(Model model) {
		log.info("@# content_view()");
		
		ArrayList<itemDTO> dtos = service.list();
		model.addAttribute("content_view",dtos);
		
		return "content_view";
	}
	
	@RequestMapping("/write_result")
	public String write(@RequestParam HashMap<String, String> param) {

		service.write(param);
		
		return "write_result";
	}
	
	@RequestMapping("/write_view")
	public String write_view() {
		log.info("wirte_view()");
		
		return "item_write";
	}
}
