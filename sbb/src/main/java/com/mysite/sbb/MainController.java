package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@GetMapping("/sbb")
	@ResponseBody
	public String index() {
		return "Hello, Welcome to sbb";
	}
	
	@GetMapping("/")
	public String root() {
		return "redirect:/question/list";
	}
	
	@GetMapping("/test")
	public String test(Model model) {
		model.addAttribute("testStr", "HTML MVC 테스트");
		return "index";
	}
}
