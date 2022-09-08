package com.sim.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sim.entity.Sim;
import com.sim.exception.SimNotFoundException;
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
	//@ResponseStatus(code = HttpStatus.OK)
	public ResponseEntity<List<Sim>> listAll() {	
		 return ResponseEntity.ok(simService.getAllSim());
	}
	
	@PostMapping(path = "/addsim")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void addSim(@RequestBody Sim sim) {
		simService.addSim(sim);
	}
	
	@PutMapping(path = "/update/{simNo}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void updateSim(@PathVariable Long simNo,@RequestBody Map<String,Object> json) {
		boolean kyc = Boolean.valueOf((String)json.get("kyc"));
		String telecomProvider= (String)json.get("telecomProvider");
		simService.updateSimInfo(simNo,kyc,telecomProvider);
	}
	
	@DeleteMapping(path = "/delete/{simNo}")
	@ResponseStatus(code = HttpStatus.OK)
	public void deleteSim(@PathVariable Long simNo) throws SimNotFoundException {
		simService.deleteSim(simNo);
	}
	
	@GetMapping(path = "/to-renew")
	@ResponseStatus(code = HttpStatus.OK)
	public List<Sim> toRenew() {
		return simService.toRenew();
	}
	
	@PutMapping(path = "/renew/{simNo}")
	@ResponseStatus(code = HttpStatus.OK)
	public Sim renew(@PathVariable Long simNo) {
		return simService.addTelepack(simNo);
	}
}
