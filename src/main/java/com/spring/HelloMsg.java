package com.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMsg {
	
	@RequestMapping(method=RequestMethod.GET,path="/hellojenking")
	public String helloWorld()
	{
		return "Hello Jenking";
		
	}

}
