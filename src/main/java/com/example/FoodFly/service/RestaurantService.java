package com.example.FoodFly.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FoodFly.Repository.RestaurantRepo;
import com.example.FoodFly.enitity.MenuItems;
import com.example.FoodFly.exception.ResourceNotFoundException;

@Service
public class RestaurantService {

	@Autowired
	public RestaurantRepo rr;
	
	public MenuItems addmenuservice(MenuItems menu) {
		// TODO Auto-generated method stub
		return rr.save(menu);
	}
//	public List<MenuItems> addallmenuservice(MenuItems menu) {
//		// TODO Auto-generated method stub
//		return rr.saveAll(menu);
//	}

	public List<MenuItems> getmenuservice() {
		// TODO Auto-generated method stub
		return rr.findAll();
	}

	public MenuItems updateitemsService(Long id, MenuItems m) {
		// TODO Auto-generated method stub
		Optional<MenuItems> foundid = rr.findById(id);
		if(foundid.isPresent()) {
			MenuItems update = foundid.get();
			
			if(m.getItem_name()!=null) {
			update.setItem_name(m.getItem_name());
			}
			
			if(m.getItem_Description() != null) {
			update.setItem_Description(m.getItem_Description());
			}
			
			if(m.getPrep_time()!= null) {
			update.setPrep_time(m.getPrep_time());
			}
			
//			if(m.getCuision_Type()!= null) {
//			update.setCuision_Type(m.getCuision_Type());
//			}
			if(m.getImage_URL()!= null) {
			update.setImage_URL(m.getImage_URL());
			}
			
			if(m.getIs_Available()!= null) {
			update.setIs_Available(m.getIs_Available());
			}
			
			if(m.getIsActive()!=null) {
			update.setIsActive(m.getIsActive());
			}
			
			if(m.getIsDelete()!= null) {
			update.setIsDelete(m.getIsDelete());
			}
			
			if(m.getPrice() != null) {
			update.setPrice(m.getPrice());
			}
			
			if(m.getRestaurantName()!= null) {
			update.setRestaurantName(m.getRestaurantName());
			}
			
//			if(m.getStatus()!= null) {
//			update.setStatus(m.getStatus());
//			}
			
			if(m.getType()!=  null) {
			update.setType(m.getType());
			}
			
			return rr.save(update);
		}
		
		throw new ResourceNotFoundException("Menu Item not Found");
	}

	public List<MenuItems> addallmenuservice(List<MenuItems> menu) {
		// TODO Auto-generated method stub
		return rr.saveAll(menu);
	}

	public MenuItems approveitemservice(Long id) {
		// TODO Auto-generated method stub
		MenuItems found = rr.findById(id).orElseThrow(()-> new ResourceNotFoundException("Id Not Found"));
		found.setIsApproved(true);
		
		return rr.save(found);
		
	}

	public MenuItems rejectimeservice(Long id) {
		// TODO Auto-generated method stub
		MenuItems found = rr.findById(id).orElseThrow(()-> new ResourceNotFoundException("Id Not Found"));
		found.setIsDelete(true);
		
		return rr.save(found);
	}

//	public Void deleteimeservice(Long id,  Boolean isDelete) {
//		// TODO Auto-generated method stub
//		 rr.deleteByIdAndIsDelete(id, isDelete);
//		 return null;
//	}

	public Void deleteimeservice(Long id) {
		// TODO Auto-generated method stub
		rr.deleteById(id);

return null;
	}
	
	

	
}
