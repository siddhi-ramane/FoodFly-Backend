package com.example.FoodFly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FoodFly.enitity.MenuItems;
import com.example.FoodFly.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	public AdminService as;
	
	@GetMapping("/get")
	public ResponseEntity<List<MenuItems>> getallmenu(){
	List<MenuItems> gotitems = as.gotallmenuservice();
	
	return  ResponseEntity.ok(gotitems);
	}
	
	
	@PatchMapping("/edit/approve/{id}")
	public ResponseEntity<MenuItems> updateitem(@PathVariable Long id){
		MenuItems approvedmenu = as.menuservice(id);
		return ResponseEntity.ok(approvedmenu);
		
	}
}
