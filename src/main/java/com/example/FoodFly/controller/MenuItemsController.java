package com.example.FoodFly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Page;

import com.example.FoodFly.enitity.CusineType;
import com.example.FoodFly.enitity.MenuItems;
import com.example.FoodFly.service.MenuItemsService;

@RestController
@CrossOrigin("*")
@RequestMapping("/menuItems")
public class MenuItemsController {

	@Autowired MenuItemsService ms;
	
	@GetMapping("/get")
	public Page<MenuItems> getAllmenu(@RequestParam (defaultValue = "1") int page, @RequestParam  (defaultValue = "8") int size){
		
		
		Page<MenuItems> getall = ms.getAllmenuservice(PageRequest.of(page, size));
		
		return getall;
	}
	
	@GetMapping("cuisine/{id}")
	public List<MenuItems> getcuisinebyid(@PathVariable Integer id){
		List<MenuItems> items = ms.getbycuisineidservice(id);
		return items;
	}
	
	@GetMapping("/search")
	public List<MenuItems> getsearcheddata(@RequestParam String q){
		List<MenuItems> data = ms.getsearcheddataservice(q);
		return data;
	}
	
	
	
}
