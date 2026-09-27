package com.example.demo.Test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Samplexmple {
	@GetMapping("/test")
	public String get() {
		System.out.println("Hello");
		return "Hello + Hello";

	}

}
