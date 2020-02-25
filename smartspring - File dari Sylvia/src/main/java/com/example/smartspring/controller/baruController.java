package com.example.smartspring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class baruController {
	@RequestMapping(value="/login2")
	public String login2() { /* untuk mengarahkan ke halaman login */
		String login2 = "login2";
		return login2;

}
	@RequestMapping(value = "/utama2") /* untuk mengarahkan ke halaman utama */
	public String beranda() {
		String beranda = "utama2";
		return beranda;
	}
	
	@RequestMapping("/login2/action")
	public String methodLoginAction(HttpServletRequest request,
			Model model) {
		String namaCtrl = request.getParameter("namaHtml");
		
		model.addAttribute("namaLempar", namaCtrl);
		String html="utama2";
		return html;
	}
}
