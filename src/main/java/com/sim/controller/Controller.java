package com.sim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sim.entity.Sim;
import com.sim.service.SimService;

@RequestMapping("/api/v1")
@RestController
public class Controller {
	
	@Autowired
	 private SimService simService;

	@GetMapping(path = "/")
	@ResponseStatus(code = HttpStatus.OK)
	public void simpleOk() {
	}
	
	@GetMapping(path = "/listall")
	@ResponseStatus(code = HttpStatus.OK)
	public void listAll() {	
		 simService.getAllSim();
	}
	
	@PostMapping(path = "/addsim")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void addSim(@RequestBody Sim sim) {
		simService.addSim(sim);
	}
	
	
}
