package com.example.smartspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class menu2Controller {

	@RequestMapping(value = "/menu2")
	public String menu2() {
		String menu2 = "/menu/menu2";
		return menu2;
	}
	
}
