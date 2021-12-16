package com.football.footballusersclubs;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.football.footballusersclubs.repositories.UserRepository;

@SpringBootApplication
public class FootballUsersClubsApplication implements CommandLineRunner {

	
	private UserRepository userRepo;
	public static void main(String[] args) {
		SpringApplication.run(FootballUsersClubsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		List<user> users = userRepo.findAll();
//		for(user u : users) {
//			System.out.println(u.toString());
//		}
		System.out.print("HELLO ALO SOSO");
	}

}
