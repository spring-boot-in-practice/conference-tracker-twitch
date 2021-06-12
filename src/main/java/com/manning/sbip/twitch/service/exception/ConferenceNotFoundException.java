package com.manning.sbip.twitch.service.exception;

public class ConferenceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 8121876449300262590L;
	
	public ConferenceNotFoundException(String message) {
		super(message);
	}

}
