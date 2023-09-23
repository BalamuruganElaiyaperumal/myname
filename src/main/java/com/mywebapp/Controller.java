package com.mywebapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping(value="/hi")
	public String hi() {
		return "My name is Bala";
	}

}
