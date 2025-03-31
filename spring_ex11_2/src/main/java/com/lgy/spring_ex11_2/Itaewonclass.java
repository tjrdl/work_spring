package com.lgy.spring_ex11_2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Itaewonclass {
	@RequestMapping("actor/actor")
	public String actor(Model model) {
		model.addAttribute("name","박새로이");
		return "actor";
	}
	@RequestMapping("actor/actress")
	public String actor2(Model model) {
		model.addAttribute("name","조이서");
		return "actress";
	}
}
