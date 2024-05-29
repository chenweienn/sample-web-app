package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "#1 Hi, Greetings from root path /";
	}

	@RequestMapping(value = "/{path}")
	public String getAnyPath(@PathVariable String path) {
		return "#1 Hi, Greetings from path /" + path;
	}
}
