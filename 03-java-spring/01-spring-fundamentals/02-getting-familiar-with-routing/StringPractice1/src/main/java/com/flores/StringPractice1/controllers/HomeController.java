package com.flores.StringPractice1.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("coding")
public class HomeController {
		
		@RequestMapping("")
		private String index()
		{
			return "Hello Coding Dojo!";
		}
		@RequestMapping("/python")
		private String python()
		{
			return "Python/Django was awesome!";
		}
		@RequestMapping("/java")
		private String getVar()
		{
			return "Java is way better!";
		}

}
