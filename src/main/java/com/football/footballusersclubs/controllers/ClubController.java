package com.football.footballusersclubs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.football.footballusersclubs.models.club;
import com.football.footballusersclubs.repositories.ClubRepository;

@RestController
public class ClubController {


	//Dependency injection 
    @Autowired private ClubRepository repo;
    //return countries pagination with default 0 page number and 10 page size
    @GetMapping("/clubs")
    public Page<club> index(
    		@RequestParam(defaultValue = "0") Integer pageNo, 
            @RequestParam(defaultValue = "10") Integer pageSize
    ) {
        Pageable pageable = PageRequest.of(pageNo, pageSize);

        return this.repo.findAll(pageable);
    }
    
    @GetMapping("/getUserByCountry/{country}")
	public List<club> getUserbyCountry(@PathVariable String country) {
		return repo.findByCountry(country);
	}

	
	
    @GetMapping("/getClubByClub/{Club}")
	public List<club> getUserbyClub(@PathVariable String Club) {
		return repo.findByClub(Club);
	}
	
	
	
	

    
	
}
