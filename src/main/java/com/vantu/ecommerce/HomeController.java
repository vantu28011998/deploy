package com.vantu.ecommerce;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping(value= {"/","/home"},method = RequestMethod.GET)
	public String homePage(Model model) {
		return "home";
	}
	
}
