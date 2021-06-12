package com.manning.sbip.twitch.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manning.sbip.twitch.model.Conference;
import com.manning.sbip.twitch.repository.ConferenceRepository;

@Service
public class ConferenceServiceImpl implements ConferenceService {

	private ConferenceRepository conferenceRepository;

	@Autowired
	public ConferenceServiceImpl(ConferenceRepository conferenceRepository) {
		this.conferenceRepository = conferenceRepository;
	}

	@Override
	public Conference createConference(Conference conference) {
		return conferenceRepository.save(conference);
	}

	@Override
	public void updateConference(long id, Conference conference) {
		Optional<Conference> optionalConference = conferenceRepository.findById(id);
		if(optionalConference.isPresent()) {
			Conference currentConference = optionalConference.get();
			currentConference.setName(conference.getName());
			currentConference.setLocation(conference.getLocation());
			currentConference.setDateTime(conference.getDateTime());
			currentConference.setSpeaker(conference.getSpeaker());
			currentConference.setStatus(conference.isStatus());
			conferenceRepository.save(currentConference);
		}
	}

	@Override
	public Iterable<Conference> getConferences() {
		return conferenceRepository.findAll();
	}

	@Override
	public void deleteConference(long id) {
		conferenceRepository.deleteById(id);
	}

	@Override
	public Optional<Conference> getConferencebyId(long id) {
		return conferenceRepository.findById(id);
	}

}
