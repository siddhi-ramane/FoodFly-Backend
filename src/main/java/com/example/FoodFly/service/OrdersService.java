package com.example.FoodFly.service;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.FoodFly.Repository.OrderRepo;
import com.example.FoodFly.enitity.FoodOrders;

import com.razorpay.RazorpayClient;
import com.razorpay.Order;



@Service 
public class OrdersService {


	
	@Autowired
	public OrderRepo repoo;
	
	@Value("${razorpay.key.id}")
	private String razorpay;
	
	@Value("${razorpay.secret.id}")
	private String razorpaysecret;
	
	private RazorpayClient client;
	
	public FoodOrders createorder(FoodOrders or) throws Exception{
		JSONObject orderreq = new JSONObject();
		
//		Orders order = new Orders();
		orderreq.put("amount", or.getTotalAmount()*100);
		orderreq.put("currency", "INR");
		
		
		
		 
		this.client = new RazorpayClient(razorpay, razorpaysecret);
		
		Order razorPayOrder = client.orders.create(orderreq);
		
		or.setRazorpayOrderId(razorPayOrder.get("id"));
		or.setOrderStatus(razorPayOrder.get("status"));
		
		repoo.save(or);
		
		return or;
	}

//	public FoodOrders orderpaymentservice(double ordercontroller) {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
