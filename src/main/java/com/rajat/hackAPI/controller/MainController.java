package com.rajat.hackAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping
	public String getRequest() {
		return "GET Request";
	}
	
	@PostMapping
	public String postRequest() {
		return "POST Request";
	}
	
	@PutMapping
	public String putRequest() {
		return "PUT Request";
	}
	
}
