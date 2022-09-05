package com.sim.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

	public List<Sim> toRenew() {
		List<Sim> simListExpiring = new ArrayList<>();
		List<Sim> sims = simRepository.findAll();
		for(Sim sim : sims) {
			LocalDate expiryDate = sim.getDate();
			LocalDate todaysDate = LocalDate.now();
			long days = ChronoUnit.DAYS.between(todaysDate,expiryDate);
			if(days<=30) {
				simListExpiring.add(sim);
			}
		}
		return simListExpiring;
	}
}

