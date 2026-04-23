package com.example.FoodFly.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.FoodFly.Repository.CartRepo;
import com.example.FoodFly.Repository.CustomerRepo;
import com.example.FoodFly.Repository.RestaurantRepo;
import com.example.FoodFly.Repository.UserManagementRepo;
import com.example.FoodFly.enitity.Cart;
import com.example.FoodFly.enitity.MenuItems;
import com.example.FoodFly.enitity.Registration;
import com.example.FoodFly.enitity.UserManagement;
import com.example.FoodFly.exception.ResourceNotFoundException;

@Service
public class CartService {

	@Autowired
	public CartRepo cr;
	
//	@Autowired
//	public CustomerRepo cusrepo;
	
	@Autowired
	public CustomerRepo ur;
	
	@Autowired
	public RestaurantRepo rr;
	
	
	public List<Cart> getallcartservice() {
		// TODO Auto-generated method stub
		

		return cr.findAll();
	}

	public void deletebyidservice(Long id) {
		// TODO Auto-generated method stub
		 cr.deleteById(id);
	}
	
	public void deleteallservice() {
		// TODO Auto-generated method stub
		 cr.deleteAll();
	}

	public Cart addmenuservice(Long custoid, Long meniuid, Integer quantity,  Double price,  Double total_amt, String area) {
		// TODO Auto-generated method stub
		Registration u= ur.findById(custoid).orElseThrow(()-> new ResourceNotFoundException("user Id Not Found"));
		MenuItems r = rr.findById(meniuid).orElseThrow(()-> new ResourceNotFoundException("menu Id Not Found"));
		
	
		
	Cart exist =  cr.findByUserAndMenu(u,r);
		
	if(exist!= null) {
		
			int updatdquantity = exist.getQuantity()+quantity;
			
		exist.setQuantity(updatdquantity);
		return cr.save(exist);
		}
		else {
		Cart newRecord = new Cart();
		newRecord.setPrice(price);
		newRecord.setQuantity(quantity);
		newRecord.setTotal_amt(total_amt);
		
		newRecord.setArea(area);
		newRecord.setMenu(r);
		newRecord.setUser(u);
		newRecord.setMenuimg(r.getImage_URL());
		
		return cr.save(newRecord);
		
	}

		
		
	}

//	public Cart getcartbyuseridservice(Cart userid) {
//		// TODO Auto-generated method stub
//		return rr.findByCustomerid(userid);
//	}

	  public List<Cart> getCartByUserIdService(Long userId) {
		  return cr.findByUser_Id(userId);

}

	  public Cart updatecartservice(Cart car) {
		// TODO Auto-generated method stub
		
		
		Cart ispresentid = cr.findById(car.getCartid()).orElseThrow(()-> new ResourceNotFoundException("CartId Not Found"));
		if(ispresentid!= null) {
			
			  int updatedQuantity = car.getQuantity();
		        ispresentid.setQuantity(updatedQuantity);

		        
		        Double price = ispresentid.getPrice();
		        ispresentid.setPrice(price);

		        
		        Double updatedTotalAmt = price * updatedQuantity;
		        ispresentid.setTotal_amt(updatedTotalAmt);
		}
		
		return cr.save(ispresentid);
		
	  }
}
