package com.example.FoodFly.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FoodFly.dto.UserManagementReqdto;
import com.example.FoodFly.dto.UserManagementResdto;
import com.example.FoodFly.enitity.UserManagement;
import com.example.FoodFly.service.UserManagementService;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")
public class UserManagementController {

	private final UserManagementService userservice; 

	
	public UserManagementController(UserManagementService userservice) {
		this.userservice = userservice;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<UserManagementResdto> getuserdata(@PathVariable Long id){
		UserManagementResdto user = userservice.getuserservice(id);
		return ResponseEntity.ok(user);
		
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<UserManagementResdto>> getallusers(){
		List<UserManagementResdto> alluser =  userservice.getallserviceuser();
		return ResponseEntity.ok(alluser);
		
	}
	
	@PostMapping("/add")
	public ResponseEntity<UserManagementResdto> addusers(@RequestBody UserManagementReqdto reqdto ){
		
		UserManagementResdto ressdto = userservice.adduserservice(reqdto);
		return ResponseEntity.ok(ressdto);
	}

  @DeleteMapping("/delete/{id}")
  public ResponseEntity<Void> deleteuser(@PathVariable Long id){
	  userservice.deleteuserservice(id);
	  return ResponseEntity.noContent().build();
	  
  }
  
  @DeleteMapping("/delete/all")
  public ResponseEntity<String> deleteall(){
	 userservice.deleteallservice();
	 return ResponseEntity.ok("All records deleted");
	  
  }
  
  
  @PatchMapping("edit/{id}")
  public ResponseEntity<UserManagementResdto> updateuser(@PathVariable Long id,  @RequestBody UserManagementReqdto reqdto ){
	  UserManagementResdto resdto=  userservice.userupdateservice(id,reqdto);
	  
	  return ResponseEntity.ok(resdto);
  }
  
}