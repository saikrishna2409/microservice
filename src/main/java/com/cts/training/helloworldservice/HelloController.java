package com.cts.training.helloworldservice;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloController {

	@GetMapping(value="/hello")
	public String display()
	{
		return "Hello";
	}
}
