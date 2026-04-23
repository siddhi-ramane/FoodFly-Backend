package com.example.FoodFly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FoodFly.enitity.ItemName;
import com.example.FoodFly.service.ItemNameService;

@RestController
@RequestMapping("/items")
@CrossOrigin("*")
public class ItemNameController {

@Autowired ItemNameService is;
	
	@GetMapping("/getItems")
	public List<ItemName> getallitems(){
	List<ItemName> items = is.getallitemsservice();
	
	return items;
	
}
}
