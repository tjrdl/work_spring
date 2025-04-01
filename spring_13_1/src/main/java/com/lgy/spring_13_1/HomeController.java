package com.lgy.spring_13_1;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

<<<<<<< HEAD
import javax.servlet.http.HttpServletRequest;

=======
>>>>>>> f78842dfd4718786e5b124489cc65f739b9267af
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
<<<<<<< HEAD

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

=======
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
>>>>>>> f78842dfd4718786e5b124489cc65f739b9267af
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
<<<<<<< HEAD

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "index";
	}

=======
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
>>>>>>> f78842dfd4718786e5b124489cc65f739b9267af
	@RequestMapping("/index")
	public String goIndex() {
		return "index";
	}
<<<<<<< HEAD

//	@RequestMapping("/student")
	// value 속성을 사용해 값을 받음
//	@RequestMapping(value = "/student")
//	@RequestMapping(method = RequestMethod.GET, value = "/student")
	@RequestMapping(method = RequestMethod.POST, value = "/student")
	public String goStudent(HttpServletRequest httpServletRequest, Model model) {
		String id = httpServletRequest.getParameter("id");
		model.addAttribute("studentId", id);
		return "student";
	}

=======
	
>>>>>>> f78842dfd4718786e5b124489cc65f739b9267af
}
