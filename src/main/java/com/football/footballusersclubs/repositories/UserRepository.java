package com.football.footballusersclubs.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.football.footballusersclubs.models.user;
public interface UserRepository extends MongoRepository<user,String> {
	
//	@Query("{'clubs.Club':?0}")
	List<user> findByClub(String club);
	
	List<user> findByName(String name);
	


}
