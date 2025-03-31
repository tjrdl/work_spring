package com.lgy.spring_11_2;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/border")
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}

//	/* @RequestMapping("/view") */
//	@RequestMapping("board/view")
//	public String name() {
//		return "border/view";
//	}
//	
//	@RequestMapping("board/title")
//	public String title(Model model) {
//		model.addAttribute("id",30);
//		return "border/title";
//	}
//	
//	@RequestMapping("board/reply")
////	public String reply() {
//	// return 타입으로 Model과 View 사용 가능
//	public ModelAndView reply() {
//		ModelAndView mv = new ModelAndView();
//		//속성에 값 추가
//		mv.addObject("id","gildong");
//		//뷰 설정(model 객체와 차이점)
//		mv.setViewName("border/reply");
//		
//		return mv;
//	}
//	@RequestMapping("shopping")
//	public String shopping() {
//		
//		return "border/shopping";
//	}
	@RequestMapping("/write")
	public String write(Model model) {
		model.addAttribute("id","aaa");
		return "border/write";
	}
}
