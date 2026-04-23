package com.example.FoodFly.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FoodFly.Repository.ItemNameRepo;
import com.example.FoodFly.enitity.ItemName;

@Service
public class ItemNameService {

	
	@Autowired ItemNameRepo ir;
	public List<ItemName> getallitemsservice() {
		// TODO Auto-generated method stub
		return ir.findAll();
	}

}
