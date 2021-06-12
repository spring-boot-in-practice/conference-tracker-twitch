package com.manning.sbip.twitch.service;

import java.util.Optional;

import com.manning.sbip.twitch.model.Conference;

public interface ConferenceService {

	Conference createConference(Conference conference);
	
	void updateConference(long id, Conference conference);
	
	Iterable<Conference> getConferences();
	
	Optional<Conference> getConferencebyId(long id);
	
	void deleteConference(long id);
}
