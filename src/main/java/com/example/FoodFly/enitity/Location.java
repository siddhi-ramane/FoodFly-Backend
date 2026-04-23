package com.example.FoodFly.enitity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class Location {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long loc_id;
	
	@NotNull
	private Double lat;
	
	@NotNull
	private Double lon;
	
	@NotNull
	private String location;
	
	@NotNull
	private String name;

	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Location(Long loc_id, @NotNull Double lat, @NotNull Double lon, @NotNull String location,
			@NotNull String name) {
		super();
		this.loc_id = loc_id;
		this.lat = lat;
		this.lon = lon;
		this.location = location;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Location [loc_id=" + loc_id + ", lat=" + lat + ", lon=" + lon + ", location=" + location + ", name="
				+ name + "]";
	}

	public Long getLoc_id() {
		return loc_id;
	}

	public void setLoc_id(Long loc_id) {
		this.loc_id = loc_id;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public Double getLon() {
		return lon;
	}

	public void setLon(Double lon) {
		this.lon = lon;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	


	
	
	
}
