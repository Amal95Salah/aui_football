package com.football.footballusersclubs.models;

import java.util.ArrayList;
import java.util.List;

public class user_club {

	public String id;
	public String external_id;
	public String name;
	public String club;
	public List<club> club1;
	public String Country;
	public int Total; 
	
	public user_club() {
	}
	
	
	public user_club(String id, String name, String club, String country, int total, String external_id) {
		super();
		this.id = id;
		this.name = name;
		this.club = club;
		Country = country;
		Total = total;
		this.external_id = external_id;
	}


	public static List<user_club>prety(List<user_club> results) {
		
		List<user_club> finals = new ArrayList<>();
		for (user_club result : results) {
		user_club temp = new user_club(result.id, result.name, result.club, result.club1.get(0).country, result.club1.get(0).Total,result.external_id);	
		finals.add(temp);
		}
		 
		 return finals;
	}
//	public String x = club1.get

}
