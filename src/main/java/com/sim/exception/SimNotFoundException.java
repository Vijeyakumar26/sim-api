package com.sim.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class SimNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public SimNotFoundException(String errorMessage) {
		super(errorMessage);
	}
	public SimNotFoundException() {
		super();
	}
	public SimNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public SimNotFoundException(Throwable cause) {
		super(cause);
	}
}
