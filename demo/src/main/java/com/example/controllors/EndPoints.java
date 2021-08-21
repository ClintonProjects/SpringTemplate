package com.example.controllors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.services.ServicesExample;

@RestController
@RequestMapping("/apis")
public class EndPoints {

	// http://localhost:8080/apis/getTest
	@GetMapping("/getTest")
	public String getString() {
		return "The server is online";
	}

	@GetMapping("/save")
	public void saveTest() {
		System.out.println("print");
	}

}
