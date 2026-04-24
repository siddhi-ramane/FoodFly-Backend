package com.example.FoodFly.controller;

import java.awt.MenuItem;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FoodFly.enitity.Cart;
import com.example.FoodFly.enitity.MenuItems;
import com.example.FoodFly.service.CartService;

@RestController

@RequestMapping(("/cart"))
public class CartController {

		
	@Autowired
	public CartService cs;
	
//	@Autowired
//	public MenuItemsService mm;
	
	@GetMapping("/all")
	public ResponseEntity<List<Cart>> getallcart(){
		List<Cart> c = cs.getallcartservice();
		return ResponseEntity.ok(c);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deletebyid(@PathVariable Long id){
		cs.deletebyidservice(id);
		return ResponseEntity.ok("Menu delete successfully");
		
	}
	
	@DeleteMapping("/delete/all")
	public ResponseEntity<String> deletebyall(){
		cs.deleteallservice();
		return ResponseEntity.ok("All Menu delete successfully");
		
	}
	
	@PostMapping("/add/cart")
	public ResponseEntity<Cart> addmenu(@RequestBody Cart cart) {

	    Long userId = cart.getUser().getId();   
	    Long menuId = cart.getMenu().getId();
	    
	    
	    Cart res = cs.addmenuservice(userId, menuId,
	        cart.getQuantity(),
	        cart.getPrice(),
	        cart.getTotal_amt(),
	        cart.getArea()
	        
	    );

	    return ResponseEntity.ok(res);
	}
	
	@GetMapping("/get/{userid}")
	public List<Cart> getcartbyuserid(@PathVariable Long userid) {
		return cs.getCartByUserIdService(userid);
	}
	
	
	
	@PatchMapping("update/cartitems")
	public ResponseEntity<Cart> updatecarrt(@RequestBody Cart car){
		
		Cart updatedmenu = cs.updatecartservice(car);
		return ResponseEntity.ok(updatedmenu);
		
	}
	
	
//	@PatchMapping("/update/menu")
//	public ResponseEntity<Cart> updatemenu(@Params)
	
	
	
	
	
	
	
	
	
}
