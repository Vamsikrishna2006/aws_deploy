package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cseController {
	@GetMapping("/home")
	public String disk() {
		return "This is build by 23MH1A05R5";
	}
	@GetMapping("/cse")
	public String disk2() {
		return "Welcome to Aditya University";
	}

}


