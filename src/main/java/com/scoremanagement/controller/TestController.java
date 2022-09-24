package com.scoremanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@GetMapping("/test1")
	public String HelloWorld() {
		return "This is test1";
	}
	
	@GetMapping("/test2")
	public String HelloWorld2() {
		return "This is test2";
	}
}