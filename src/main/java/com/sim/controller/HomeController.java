package com.sim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sim.entity.Sim;
import com.sim.repository.SimRepository;

@RequestMapping("/api/v1")
@RestController
public class HomeController {
	
	 @Autowired
	 private SimRepository simRepository;

	@GetMapping(path = "/")
	@ResponseStatus(code = HttpStatus.OK)
	public void simpleOk() {
	}
	
	@GetMapping(path = "/listall")
	@ResponseStatus(code = HttpStatus.OK)
	public List<Sim> listAll() {	
		return simRepository.findAll();
	}
	
	@PostMapping(path = "/addsim")
	@ResponseStatus(code = HttpStatus.CREATED)
	public String addSim() {
		return "From Simple API";
	}
}
