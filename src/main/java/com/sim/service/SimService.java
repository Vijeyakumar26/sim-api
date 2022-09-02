package com.sim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sim.entity.Sim;
import com.sim.repository.SimRepository;

@Service
public class SimService {
	
	@Autowired
	 private SimRepository simRepository;
	
	public List<Sim> getAllSim() {
		return simRepository.findAll();
	}
	
	
	public void addSim(Sim sim) {		
		simRepository.save(new Sim(null, null, null, null, false, null, null));
	}

	public boolean updateSimInfo(Sim sim) {
		simRepository.save(null);
		return false;
	}

	public void deleteSim(String placeName) {
		simRepository.delete(null);
	}
}

