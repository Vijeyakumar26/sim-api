package com.sim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sim.entity.Sim;

@Repository
public interface SimRepository extends JpaRepository<Sim, Long>{

}
