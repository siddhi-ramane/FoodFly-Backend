package com.example.FoodFly.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FoodFly.Repository.AsignRoleRepo;
import com.example.FoodFly.enitity.AssignRole;
import com.example.FoodFly.enitity.Registration;
import com.example.FoodFly.exception.ResourceNotFoundException;

@Service 
public class AssignRoleService {

	@Autowired
	public AsignRoleRepo ar;
	
	public AssignRole asignroleservice(AssignRole as) {
		// TODO Auto-generated method stub
		return ar.save(as);
	}

	public List<AssignRole> getallrole() {
		// TODO Auto-generated method stub
		return ar.findAll();
	}

		public AssignRole loginassignservice(AssignRole a) {
			// TODO Auto-generated method stub
			AssignRole as = ar.findByEmail(a.getEmail()).orElseThrow(()->new ResourceNotFoundException("Email not Found"));
			if(as.getPassword().equals(a.getPassword())){
				return as;
			}
			else {
				throw new RuntimeException("Invalid Password");
			}
			
		}

}
