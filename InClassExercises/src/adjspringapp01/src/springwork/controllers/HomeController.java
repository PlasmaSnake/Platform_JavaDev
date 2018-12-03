package springwork.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public ModelAndView welcome() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	
	@RequestMapping("/showitems")
	public ModelAndView userPage(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("ShowItems");
//		HttpSession se = request.getSession();
//		se.setAttribute("item", request.getParameter("name"));
		mav.addObject("item_name", 	request.getParameter("item_name"));
		mav.addObject("item_desc", 	request.getParameter("item_desc"));
		return mav;
	}
	
	@RequestMapping("/newitem")
	public ModelAndView newItem(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("NewItem");
		
		mav.addObject("item_name", 	request.getParameter("item_name"));
		mav.addObject("item_desc", 	request.getParameter("item_desc"));
		return mav;
	}

	
	@RequestMapping("/index")
	public ModelAndView backIndex() {
		return new ModelAndView("index");
	}
}
