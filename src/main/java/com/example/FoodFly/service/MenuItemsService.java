package com.example.FoodFly.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import com.example.FoodFly.Repository.MenuItemsRepo;
import com.example.FoodFly.enitity.CusineType;
import com.example.FoodFly.enitity.MenuItems;
import com.example.FoodFly.exception.ResourceNotFoundException;


@Service
public class MenuItemsService {
	
	@Autowired MenuItemsRepo mr;

	public Page<MenuItems> getAllmenuservice(Pageable pg) {
		// TODO Auto-generated method stub
		Page<MenuItems> getMenu =  mr.findByIsApprovedTrue(pg);
		if(getMenu.isEmpty()) {
			throw new ResourceNotFoundException("Item is not approved");
		}
		
		return getMenu;
	}
	
	

	public List<MenuItems> getbycuisineidservice(Integer id) {
		// TODO Auto-generated method stub
		return mr.findByCuisinetype_CusineTypeid(id);
	}



	public List<MenuItems> getsearcheddataservice(String q) {
		// TODO Auto-generated method stub
		String Query = q.toLowerCase().trim();
		
		return mr.searchbyitemorrestaurant(Query);
		
	}


}
