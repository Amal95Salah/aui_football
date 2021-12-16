package com.football.footballusersclubs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.football.footballusersclubs.models.user_club;
import com.football.footballusersclubs.repositories.Club_UserRepository;

@RestController
public class Club_UserController {

	
	//Dependency injection 
    @Autowired private Club_UserRepository repo;
    //return countries pagination with default 0 page number and 10 page size
    @GetMapping("/user_club")
    public List<user_club> index() {

        return repo.findAll();
    }
	
}
