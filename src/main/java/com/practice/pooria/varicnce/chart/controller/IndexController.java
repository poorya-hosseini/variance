package com.practice.pooria.varicnce.chart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String getLandingPage() {
		return "index";
	}
}
