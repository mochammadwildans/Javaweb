package com.example.smartspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class menu1Controller { 

	@RequestMapping(value = "/menu1") /* untuk mengarahkan ke halaman utama 
	@RequestMapping untuk memberikan url nya*/
	public String menu1() {
		String menu1 = "/menu/menu1";
		return menu1;
	}
	
}

/* setiap menu baru membuat controller baru agar biar rapi aja */