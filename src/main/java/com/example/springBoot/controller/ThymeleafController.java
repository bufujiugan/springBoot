package com.example.springBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ThymeleafController {

	@RequestMapping(value = "/greeting")
	public ModelAndView test(ModelAndView mv) {
		mv.setViewName("greeting");
		mv.addObject("title", "欢迎使用Thymeleaf!");
		return mv;
	}

	@RequestMapping(value = "/greeting1", method = RequestMethod.GET)
	public String test1(ModelMap map) {
		map.addAttribute("title", "欢迎使用Thymeleaf1!");
		return "greeting";
	}
	
	@RequestMapping(value = "/greeting2", method = RequestMethod.GET)
	public String test2(Model model) {
		model.addAttribute("title", "欢迎使用Thymeleaf2!");
		return "greeting";
	}

}
