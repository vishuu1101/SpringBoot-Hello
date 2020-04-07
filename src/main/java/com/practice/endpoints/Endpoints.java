package com.practice.endpoints;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Endpoints {
	
	@GetMapping(path = "/say-hello/{name}")
	public @ResponseBody String sayHello(@PathVariable(value = "name")String name) {
		return "Hello "+name;
	}

}
