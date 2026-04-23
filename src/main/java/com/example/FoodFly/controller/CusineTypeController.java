package com.example.FoodFly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FoodFly.enitity.CusineType;

import com.example.FoodFly.service.CusineTypeService;

@RestController
@RequestMapping("/cuisine")
@CrossOrigin("*")
public class CusineTypeController {

	@Autowired CusineTypeService cs;
	@GetMapping("/getcusine")
	public List<CusineType> getallcuisine(){
	List<CusineType> items = cs.getallcuisineservice();
	
	return items;
	
}
	
	
	
}
