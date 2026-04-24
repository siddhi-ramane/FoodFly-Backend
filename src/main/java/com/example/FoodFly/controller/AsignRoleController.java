package com.example.FoodFly.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FoodFly.enitity.AssignRole;
import com.example.FoodFly.service.AssignRoleService;

@RestController
@RequestMapping("/Role")
@CrossOrigin(origins = "https://food-fly-frontend-three.vercel.app")
public class AsignRoleController {

	@Autowired
	public AssignRoleService s;
	
	@PostMapping("/add")
	public ResponseEntity<AssignRole> assignrole(@RequestBody AssignRole as){
		AssignRole a = s.asignroleservice(as);
		
		return ResponseEntity.ok(a);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<AssignRole>> getAllrole(){
		List<AssignRole> a = s.getallrole();
		return ResponseEntity.ok(a);
	}
		@PostMapping("/Login")
		public ResponseEntity<AssignRole> loginRole(@RequestBody AssignRole a){
			AssignRole as = s.loginassignservice(a);
		return ResponseEntity.ok(as);
		
	}
}
