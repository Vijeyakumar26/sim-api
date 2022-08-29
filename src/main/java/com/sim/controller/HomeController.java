package com.sim.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public void addSim(@RequestBody Map<String, Object> jsonData) {
		long simCardNo = Long.valueOf((String) jsonData.get("simCardNo"));
		long mobileNo = (long) jsonData.get("mobileNo");
		String status = (String) jsonData.get("status");
		String date = (String) jsonData.get("date");
		String state = (String) jsonData.get("state");
		boolean kyc = (boolean) jsonData.get("kyc");
		String telecomProvider = (String) jsonData.get("telecomProvider");
		String fullName = (String) jsonData.get("fullName");
		Sim sim = new Sim(simCardNo, mobileNo, status, date, state,kyc , telecomProvider, fullName);
		simRepository.save(sim);
	}
}
