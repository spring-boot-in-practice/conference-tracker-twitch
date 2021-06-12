package com.manning.sbip.twitch.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.manning.sbip.twitch.model.Conference;

@Repository
public interface ConferenceRepository extends CrudRepository<Conference, Long>{

}
