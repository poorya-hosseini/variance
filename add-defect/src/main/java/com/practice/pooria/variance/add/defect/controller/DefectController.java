package com.practice.pooria.variance.add.defect.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefectController {

	@RequestMapping("/addDefect")
	public String getAddDefectPage() {
		return "addDefect";
	}
}
