package com.example.FoodFly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FoodFly.enitity.MenuItems;
import com.example.FoodFly.service.RestaurantService;

@RestController
@RequestMapping("/menu")

public class RestaurantController {

	@Autowired
	public RestaurantService rs;
	
	@PostMapping("/add/items")
	public ResponseEntity<MenuItems> addMenu(@RequestBody MenuItems menu){
		MenuItems savedmenu = rs.addmenuservice(menu);
		
		return ResponseEntity.ok(savedmenu);
		
	}
	@PostMapping("/add/allitems")
	public ResponseEntity<List<MenuItems>> addallMenu(@RequestBody List<MenuItems> menu){
		List<MenuItems> savedmenu = rs.addallmenuservice(menu);
		
		return ResponseEntity.ok(savedmenu);
		
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<MenuItems>> getmenus(){
		List<MenuItems> gotitem = rs.getmenuservice() ;
		return ResponseEntity.ok(gotitem);
	}
	
	@PatchMapping("/edit/{id}")
	public ResponseEntity<MenuItems> updateitems(@PathVariable Long id, @RequestBody MenuItems m ){
		MenuItems updatemenu = rs.updateitemsService(id, m);
		return ResponseEntity.ok(updatemenu);
	}
	
	@PatchMapping("{id}/approve")
	public ResponseEntity<MenuItems> approveitem(@PathVariable Long id){
		MenuItems m = rs.approveitemservice(id);
		
		return  ResponseEntity.ok(m);
	}
	
	
	@PatchMapping("{id}/reject")
	public ResponseEntity<MenuItems> rejectItems(@PathVariable Long id){
		MenuItems m = rs.rejectimeservice(id);
		return  ResponseEntity.ok(m);
	}
	
	
	@DeleteMapping("{id}/delete")
	public ResponseEntity<Void> deleteitems(@PathVariable Long id){
		Void m = rs.deleteimeservice(id);
		return  ResponseEntity.ok(m);
	}
	
}
