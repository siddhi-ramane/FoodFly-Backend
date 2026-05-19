//package com.example.FoodFly.service;
//
//import org.json.JSONObject;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//
//import com.example.FoodFly.Repository.OrderRepo;
//import com.example.FoodFly.enitity.FoodOrders;
//import com.razorpay.Order;
//import com.razorpay.RazorpayClient;
//
//@Service
//public class OrdersService {
//
//    @Autowired
//    private OrderRepo repoo;
//
//    @Value("${razorpay.key.id}")
//    private String razorpay;
//
//    @Value("${razorpay.secret.id}")
//    private String razorpaysecret;
//
//    private RazorpayClient client;
//
//    public FoodOrders createorder(FoodOrders order) throws Exception {
//
//        JSONObject orderRequest = new JSONObject();
//
//        orderRequest.put("amount", order.getTotalAmount() * 100);
//        orderRequest.put("currency", "INR");
//
//        client = new RazorpayClient(razorpay, razorpaysecret);
//
//        Order razorPayOrder = client.orders.create(orderRequest);
//
//        order.setRazorpayOrderId(razorPayOrder.get("id"));
//        order.setOrderStatus(razorPayOrder.get("status"));
//
//        repoo.save(order);
//
//        return order;
//    }
//}