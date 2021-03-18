package com.learncode.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloworldController {
	@GetMapping("/")
	public String showHello1() {
		return "helloworld";
	}
	
	@GetMapping("/helloName")
	public String helloName() {
		return "helloworld";
	}
	
	@GetMapping("/display")
	public String displayName(HttpServletRequest request) {
		String name = request.getParameter("nameFromForm");
		System.out.println("=> " + name);
		request.setAttribute("NAME", name);
		return "display";
	}
}
