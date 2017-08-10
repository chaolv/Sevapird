package dev.chao.sevapird.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequestMapping("/hello")
public class FirstController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello";
	}
	
}
