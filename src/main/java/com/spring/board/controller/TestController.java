package com.spring.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.error.NotFoundError;

@Controller
public class TestController {
	@RequestMapping("/")
	public String home() {
		
		return "Home";
	}
	
	@RequestMapping("/admin")
	public String admin() {
		return "admin/admin";
	}
	
	@RequestMapping("/notFound")
	public void noFoundError() {
		throw new NotFoundError("error/-7");
	}
}
