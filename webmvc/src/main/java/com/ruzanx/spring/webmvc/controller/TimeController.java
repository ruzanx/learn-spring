package com.ruzanx.spring.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ruzanx.spring.webmvc.model.Exercise;

@Controller
public class TimeController {
	
	@RequestMapping(value="/addMinute")
	public String addMinute(@ModelAttribute("exercise") Exercise exercise ){
		System.out.println(exercise.getMinutes());
		return "addMinute";
	}
}
