package com.project.clg.clg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@org.springframework.stereotype.Controller
public class Controller {


	@GetMapping("/")
	public String home() {
		return "home" ;
	}
	
	@GetMapping("/login")
	public String login() {
		return "login" ;
	}
	
//	public void add(ResourceHandlerRegistry res) {
//		res.addResourceHandler("/image/**").addResourceLocations("/resources/");
//	}
	
	public void add1(ResourceHandlerRegistry res) {
		res.addResourceHandler("/static/**").addResourceLocations("/resources/");
	}
	
	public void add(ResourceHandlerRegistry res) {
		res.addResourceHandler("/css/**").addResourceLocations("/css/");
	}
}
