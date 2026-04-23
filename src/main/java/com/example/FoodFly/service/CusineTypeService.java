package com.example.FoodFly.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FoodFly.Repository.CusineTypeRepo;
import com.example.FoodFly.enitity.CusineType;
import com.example.FoodFly.exception.ResourceNotFoundException;


@Service
public class CusineTypeService {

	@Autowired CusineTypeRepo cr;
	public List<CusineType> getallcuisineservice() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}

}
