package com.security.jwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		System.out.println("HelloController-- default home--");
		return "Welcome to default page";
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String user() {
		System.out.println("HelloController--user--");
		return "Welcome to user page";
	}

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String admin() {
		System.out.println("HelloController--Admin--");
		return "Welcome to admin page";
	}

}
