package com.football.footballusersclubs.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.football.footballusersclubs.models.user_club;

public interface Club_UserRepository extends MongoRepository<user_club,String> {

//	List<user_club> findByClub(String club);

}
