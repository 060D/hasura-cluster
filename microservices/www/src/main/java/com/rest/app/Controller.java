package com.rest.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {
	
	@RequestMapping(path="/hello")
	public String hello() {
		return "Welcome" ; 
	}

}
