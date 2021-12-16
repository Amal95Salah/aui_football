package com.football.footballusersclubs.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection ="users")
public class user {

	@Id
	public String id;
	public String external_id;
	public String external_id_str;
	public String name;
	public String screen_name;
	public String club;
	public String location;
	public String description;
	public String url;
	
	//-----------------
	
	public club club1;
	///----------
//	@persistent(protected)
//	public boolean protected; change name

//	public String followers_count;
//	public String friends_count;
//	public String listed_count;
//	public String created_at;
//	public String favourites_count;
//	public String utc_offset;
//	public String time_zone;
//	public String geo_enabled;
//	public String verified;
//	public String statuses_count;
//	public String lang;
//	public String contributors_enabled;
//	public String is_translator;
//	public String is_translation_enabled;
//	public String profile_background_color;
	
	
	public user() {
		
	}
		
	public user(String id, String external_id, String external_id_str, String name, String screen_name, String club,
			String location, String description, String url, String followers_count, String friends_count,
			String listed_count, String created_at, String favourites_count, String utc_offset, String time_zone,
			String geo_enabled, String verified, String statuses_count, String lang, String contributors_enabled,
			String is_translator, String is_translation_enabled, String profile_background_color) {
		super();
		this.id = id;
		this.external_id = external_id;
		this.external_id_str = external_id_str;
		this.name = name;
		this.screen_name = screen_name;
		this.club = club;
		this.location = location;
		this.description = description;
		this.url = url;
//		this.followers_count = followers_count;
//		this.friends_count = friends_count;
//		this.listed_count = listed_count;
//		this.created_at = created_at;
//		this.favourites_count = favourites_count;
//		this.utc_offset = utc_offset;
//		this.time_zone = time_zone;
//		this.geo_enabled = geo_enabled;
//		this.verified = verified;
//		this.statuses_count = statuses_count;
//		this.lang = lang;
//		this.contributors_enabled = contributors_enabled;
//		this.is_translator = is_translator;
//		this.is_translation_enabled = is_translation_enabled;
//		this.profile_background_color = profile_background_color;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getExternal_id() {
		return external_id;
	}
	public void setExternal_id(String external_id) {
		this.external_id = external_id;
	}
	public String getExternal_id_str() {
		return external_id_str;
	}
	public void setExternal_id_str(String external_id_str) {
		this.external_id_str = external_id_str;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getScreen_name() {
		return screen_name;
	}
	public void setScreen_name(String screen_name) {
		this.screen_name = screen_name;
	}
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
//	public String getFollowers_count() {
//		return followers_count;
//	}
//	public void setFollowers_count(String followers_count) {
//		this.followers_count = followers_count;
//	}
//	public String getFriends_count() {
//		return friends_count;
//	}
//	public void setFriends_count(String friends_count) {
//		this.friends_count = friends_count;
//	}
//	public String getListed_count() {
//		return listed_count;
//	}
//	public void setListed_count(String listed_count) {
//		this.listed_count = listed_count;
//	}
//	public String getCreated_at() {
//		return created_at;
//	}
//	public void setCreated_at(String created_at) {
//		this.created_at = created_at;
//	}
//	public String getFavourites_count() {
//		return favourites_count;
//	}
//	public void setFavourites_count(String favourites_count) {
//		this.favourites_count = favourites_count;
//	}
//	public String getUtc_offset() {
//		return utc_offset;
//	}
//	public void setUtc_offset(String utc_offset) {
//		this.utc_offset = utc_offset;
//	}
//	public String getTime_zone() {
//		return time_zone;
//	}
//	public void setTime_zone(String time_zone) {
//		this.time_zone = time_zone;
//	}
//	public String getGeo_enabled() {
//		return geo_enabled;
//	}
//	public void setGeo_enabled(String geo_enabled) {
//		this.geo_enabled = geo_enabled;
//	}
//	public String getVerified() {
//		return verified;
//	}
//	public void setVerified(String verified) {
//		this.verified = verified;
//	}
//	public String getStatuses_count() {
//		return statuses_count;
//	}
//	public void setStatuses_count(String statuses_count) {
//		this.statuses_count = statuses_count;
//	}
//	public String getLang() {
//		return lang;
//	}
//	public void setLang(String lang) {
//		this.lang = lang;
//	}
//	public String getContributors_enabled() {
//		return contributors_enabled;
//	}
//	public void setContributors_enabled(String contributors_enabled) {
//		this.contributors_enabled = contributors_enabled;
//	}
//	public String getIs_translator() {
//		return is_translator;
//	}
//	public void setIs_translator(String is_translator) {
//		this.is_translator = is_translator;
//	}
//	public String getIs_translation_enabled() {
//		return is_translation_enabled;
//	}
//	public void setIs_translation_enabled(String is_translation_enabled) {
//		this.is_translation_enabled = is_translation_enabled;
//	}
//	public String getProfile_background_color() {
//		return profile_background_color;
//	}
//	public void setProfile_background_color(String profile_background_color) {
//		this.profile_background_color = profile_background_color;
//	}
	@Override
	public String toString() {
		return "user [id=" + id + ", external_id=" + external_id + ", external_id_str=" + external_id_str + ", name="
				+ name + ", screen_name=" + screen_name + ", club=" + club + ", location=" + location + ", description="  + "]";
	}

	
}
