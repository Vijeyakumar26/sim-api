package com.sim.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sim.entity.Sim;
import com.sim.exception.SimNotFoundException;
import com.sim.repository.SimRepository;

@Service
public class SimService {
	
	@Autowired
	 private SimRepository simRepository;
	
	public List<Sim> getAllSim() {
		return simRepository.findAll();
	}
	
	public void addSim(Sim sim) {		
		simRepository.save(sim);
	}

	public void updateSimInfo(Long simNo, boolean kyc, String telecom) {
		Optional<Sim> simFound = simRepository.findById(simNo);
		if(simFound.isPresent()) {
			Sim sim = simFound.get();
			sim.setKyc(kyc);
			sim.setTelecomProvider(telecom);
			simRepository.save(sim);
		}
	}

	public void deleteSim(Long simNo) {	
		simRepository.deleteById(simNo);		
	}
}

