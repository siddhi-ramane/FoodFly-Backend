package com.example.FoodFly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.FoodFly.enitity.FoodOrders;
import com.example.FoodFly.service.OrdersService;

@Controller
public class OrdersController {

	@Autowired
	private OrdersService oo;
	
	 @CrossOrigin(origins = "*")
	 
	 
	 
	    @PostMapping("/create-order")
	 @ResponseBody
	 public FoodOrders ordercontroller(@RequestBody FoodOrders or ) throws Exception{
		 FoodOrders res = oo.createorder(or);
		 return res;
		 
		
	 }
}
