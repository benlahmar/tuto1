package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Test {

	@GetMapping("/abc/{p}")
	public String hi(@PathVariable String p)
	{
		return "hello Mr"+p;
	}
}