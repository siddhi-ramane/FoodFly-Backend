package com.example.FoodFly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.FoodFly.enitity.OrderTransactionSetailsEntity;
import com.example.FoodFly.service.OrderServices;

@RestController

public class PaymentTransactionController {
       
    @Autowired
    private OrderServices orderservices;
    @CrossOrigin(origins = "*")
    @GetMapping("/getTransaction/{amount}")
    public OrderTransactionSetailsEntity getTransaction(@PathVariable(name ="amount") double amount) {
        OrderTransactionSetailsEntity transactionDetails = orderservices.orderCreateTransaction(amount);
   if (transactionDetails != null) {
   return transactionDetails;
   } else {
   // Handle error case
   return null; // Return an error response, or you could throw a custom exception
   }
   }
}