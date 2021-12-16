package com.football.footballusersclubs.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.football.footballusersclubs.models.club;
import java.util.List;

public interface ClubRepository extends MongoRepository<club,String>{

//	@Query("{'club.Club':?0}")
	List<club> findByClub(String Club);
//	
//	List<club> findByCountry(String Country);
	
	List<club> findByCountry(String Country);

}
