package com.example.FoodFly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FoodFly.enitity.Location;
import com.example.FoodFly.service.LocationService;

@RestController
@RequestMapping("/loc")
public class LocationController {

	
	@Autowired LocationService ls;
	
	@PostMapping("/add")
	public ResponseEntity<List<Location>> postLoc(@RequestBody List<Location> l){
		List<Location> loc = ls.postlocationservice(l);
		return ResponseEntity.ok(loc);
	}
}
