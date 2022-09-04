package com.sim.exception;

public class SimNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SimNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
