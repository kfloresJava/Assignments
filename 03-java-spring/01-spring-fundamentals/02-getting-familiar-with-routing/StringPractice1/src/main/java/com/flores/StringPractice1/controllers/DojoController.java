package com.flores.StringPractice1.controllers;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("dojo")
public class DojoController {

			@RequestMapping("")
			private String index()
			{
				return String.format("The dojo is awesome");
			}
			@RequestMapping("/{location}")
			private String locations(@PathVariable("location") String valx)
			{ 
				if(valx.equalsIgnoreCase("burbank"))
				{
					return "Burbank Dojo is located in Southern California";
				}
				if(valx.equalsIgnoreCase("san-jose"))
				{
					return "SJ dojo is the headquarters";
				}
				return "";
			}
			
	}


