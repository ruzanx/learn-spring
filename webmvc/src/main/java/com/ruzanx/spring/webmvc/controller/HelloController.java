package com.ruzanx.spring.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping(value="/hello") // URL http://localhost:8080/webmvc/hello.html
	public String sayHello(Model model) {
		model.addAttribute("greeting", "Hello World! <br> <p>hello controller</p>");
		return "hello"; // JSP name
	}
}
