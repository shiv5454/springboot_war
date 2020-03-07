package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

	@GetMapping({"/","","/home"})
	public String home( Model model) {
		model.addAttribute("message", "Welcome to world");
		return "home";
	}
	
	@GetMapping("/contact")
	public String contact( Model model) {
		model.addAttribute("message", "Contact us on : 9458705454");
		return "contact";
	}
	
	@GetMapping("/**")
	public String error(Model model) {
		model.addAttribute("message", "404 Page Not Found...");
		return "error";
	}
}
