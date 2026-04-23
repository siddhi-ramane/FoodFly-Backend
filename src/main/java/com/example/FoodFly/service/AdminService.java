package com.example.FoodFly.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FoodFly.Repository.AdminRepo;
import com.example.FoodFly.enitity.MenuItems;
import com.example.FoodFly.exception.ResourceNotFoundException;

@Service
public class AdminService {

	@Autowired
	public AdminRepo ar;
	
	public List<MenuItems> gotallmenuservice() {
		// TODO Auto-generated method stub
		return ar.findAll();
	}

	public MenuItems menuservice(Long id) {
		// TODO Auto-generated method stub
		Optional<MenuItems> present = ar.findById(id);
		if(present.isPresent()) {
			MenuItems update = present.get();
			update.setIsActive(true);
			return ar.save(update);
		}
		else {
			 throw new ResourceNotFoundException("Id not found");
		}
	}

}
