package com.example.smartspring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class awalController {
	public String login() { /* untuk mengarahkan ke halaman login */
		String login = "login";
		return login;
	}

	@RequestMapping(value = "/utama") /* untuk mengarahkan ke halaman utama */
	public String beranda() {
		String beranda = "utama";
		return beranda;
	}

	/*
	 * Bagian yg gak jadi cuy
	 * 
	 * @RequestMapping(value = "/menu/menu1") untuk mengarahkan ke halaman utama
	 * 
	 * @RequestMapping untuk memberikan url nya public String nyobamenu1() { String
	 * nyobamenu1 = "/menu/menu1"; return nyobamenu1; }
	 */

	@RequestMapping("/login/action")
	public String methodLoginAction(HttpServletRequest request,
			Model model) { /*
							 * HttpServletRequest request digunakan ketika mau mengambil parameter model
							 * untuk mengembalikan
							 */
		String akunCtrl = request.getParameter("akunHtml");
		String passwordCtrl = request.getParameter("passwordHtml");

		model.addAttribute("akunLempar", akunCtrl); // nama dari data yang akan di bundle, data
		model.addAttribute("passwordLempar", passwordCtrl);

		String html = "utama";
		return html;
	}

}
