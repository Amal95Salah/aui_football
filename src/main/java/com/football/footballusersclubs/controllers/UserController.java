package com.football.footballusersclubs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.LookupOperation;
import org.springframework.data.mongodb.core.aggregation.MatchOperation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.football.footballusersclubs.models.user;
import com.football.footballusersclubs.models.user_club;
import com.football.footballusersclubs.repositories.UserRepository;

@RestController
public class UserController {


	@Autowired
  private MongoTemplate mongoTemplate;

	
	//http://localhost:8080/x?id=60a0ef61138fd90d17885890&id=60a0ef61138fd90d17885894
//	http://localhost:8080/x?id=1080394224384860160&id=186386857
    @GetMapping("/x")
	public List<user_club> x(
			@RequestParam List<String> id,
    		@RequestParam(defaultValue = "0") Integer pageNo, 
            @RequestParam(defaultValue = "10") Integer pageSize) {
	LookupOperation lookupOperation = LookupOperation.newLookup()
            .from("clubs")
            .localField("club")
            .foreignField("Club")
            .as("club1");
	
	Criteria criteria = Criteria.where("external_id_str").in(id);
	MatchOperation matchOperation = Aggregation.match(criteria);
	  Pageable pageable = PageRequest.of(pageNo, pageSize);

	Aggregation aggregation = Aggregation.newAggregation(
			Aggregation.limit(pageable.getPageSize()),
			matchOperation,
			lookupOperation
			);
//			   Aggregation aggregation = Aggregation.newAggregation(Aggregation.project("name", "club.[0].Country"),lookupOperation);

  List<user_club> results = this.mongoTemplate.aggregate(aggregation, "users", user_club.class).getMappedResults(); // TODO
  return user_club.prety(results);
  
//	return results;
	}

	
	//Dependency injection 
    @Autowired private UserRepository repo;
    //return countries pagination with default 0 page number and 10 page size
    @GetMapping("/users")
    public Page<user> index(
    		@RequestParam(defaultValue = "0") Integer pageNo, 
            @RequestParam(defaultValue = "10") Integer pageSize
    ) {
        Pageable pageable = PageRequest.of(pageNo, pageSize);

        return this.repo.findAll(pageable);
    }

    @GetMapping("/getUserByClub/{club}")
	public List<user> getUserbyClub(@PathVariable String club) {
		
//		return this.x();
		return repo.findByClub(club);
	}
	
	
	@GetMapping("/getUserByName/{name}")
	public List<user> getUserbyName(@PathVariable String name) {
		return repo.findByName(name);
	}
	
	
	
    
}
