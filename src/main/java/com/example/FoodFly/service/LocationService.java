package com.example.FoodFly.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FoodFly.Repository.LocationRepo;
import com.example.FoodFly.enitity.Location;

@Service
public class LocationService {

	
	@Autowired LocationRepo lr ;
	
	
	public List<Location> postlocationservice (List<Location> l) {
		// TODO Auto-generated method stub
		return lr.saveAll(l);
	}

}
