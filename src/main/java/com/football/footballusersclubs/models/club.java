package com.football.footballusersclubs.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection ="clubs")
public class club {

	@Id
	public String id;
	public String Club;
	@Field("Country")
	public String country;
	public String UCL;
	public String UEL;
	public String CWC;
	public String USC;
	public String UIC;
	public String IC;
	public int Total;
	
	public club() {
		
	}

	public club(String id, String club, String country, String uCL, String uEL, String cWC, String uSC, String uIC,
			String iC, int total) {
		super();
		this.id = id;
		Club = club;
		this.country = country;
		UCL = uCL;
		UEL = uEL;
		CWC = cWC;
		USC = uSC;
		UIC = uIC;
		IC = iC;
		Total = total;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClub() {
		return Club;
	}

	public void setClub(String club) {
		Club = club;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		country = country;
	}

	public String getUCL() {
		return UCL;
	}

	public void setUCL(String uCL) {
		UCL = uCL;
	}

	public String getUEL() {
		return UEL;
	}

	public void setUEL(String uEL) {
		UEL = uEL;
	}

	public String getCWC() {
		return CWC;
	}

	public void setCWC(String cWC) {
		CWC = cWC;
	}

	public String getUSC() {
		return USC;
	}

	public void setUSC(String uSC) {
		USC = uSC;
	}

	public String getUIC() {
		return UIC;
	}

	public void setUIC(String uIC) {
		UIC = uIC;
	}

	public String getIC() {
		return IC;
	}

	public void setIC(String iC) {
		IC = iC;
	}

	public int getTotal() {
		return Total;
	}

	public void setTotal(int total) {
		Total = total;
	}

	@Override
	public String toString() {
		return "club [id=" + id + ", Club=" + Club + ", Country=" + country + ", UCL=" + UCL + ", UEL=" + UEL + ", CWC="
				+ CWC + ", USC=" + USC + ", UIC=" + UIC + ", IC=" + IC + ", Total=" + Total + "]";
	}
	
	
	
	
}
