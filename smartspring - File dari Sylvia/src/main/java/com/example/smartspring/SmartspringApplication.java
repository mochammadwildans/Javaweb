package com.example.smartspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class SmartspringApplication {

	@RequestMapping(value="/")
	public String login() {
		String login = "login";
		return login;
	}
	public static void main(String[] args) {
		SpringApplication.run(SmartspringApplication.class, args);
	}

}
