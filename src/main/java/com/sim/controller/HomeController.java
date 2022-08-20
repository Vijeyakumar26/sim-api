package com.sim.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseBody
@Controller
public class HomeController {

	@GetMapping(path = "/")
	@ResponseStatus(code = HttpStatus.OK)
	public static String simpleOk() {
		return "From Simple API";
	}
	
	@GetMapping(path = "/listall")
	@ResponseStatus(code = HttpStatus.OK)
	public static String listAll() {
		return "From Simple API";
	}
	
	@PostMapping(path = "/add")
	@ResponseStatus(code = HttpStatus.OK)
	public static String addSim() {
		return "From Simple API";
	}
}
