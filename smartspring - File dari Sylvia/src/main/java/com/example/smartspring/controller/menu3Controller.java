package com.example.smartspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class menu3Controller {

	@RequestMapping(value = "/menu3")
	public String menu3() {
		String menu3 = "/menu/menu3";
		return menu3;
	}
	
}
