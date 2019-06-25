package com.example.jxspring1;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HelloController {

	@GetMapping("/hello")
	public String sayHello(){
		return "Hello from Jx Spring App";
	}
	
	@GetMapping("/hello/{yourName}")
	public String sayHello(@PathVariable(value = "yourName") String yourName){
		return "Hello " + yourName;
	}
	
}
