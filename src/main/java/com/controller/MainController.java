package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping(value = "/home")
	public String homePage()
	{
		return "home";
	}
	
	@RequestMapping(value = "/synoptek")
	public String synoptekPage()
	{
		return "synoptek";
	}
	
}

