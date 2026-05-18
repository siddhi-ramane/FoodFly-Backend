package com.example.FoodFly.service;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.FoodFly.enitity.OrderTransactionSetailsEntity;
import com.razorpay.Order;
import com.razorpay.RazorpayClient;

@Service
public class OrderServices {

    @Value("${razorpay.key.id}")
    private String KEY;

    @Value("${razorpay.key.secret}")
    private String KEY_SECRET;

    private static final String CURRENCY = "INR";

    public OrderTransactionSetailsEntity orderCreateTransaction(double amount) {

        try {

            JSONObject jsonObject = new JSONObject();
            jsonObject.put("amount", amount * 100);
            jsonObject.put("currency", CURRENCY);

            RazorpayClient razorpayClient =
                    new RazorpayClient(KEY, KEY_SECRET);

            Order order = razorpayClient.orders.create(jsonObject);

            return orderTransaction(order);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    private OrderTransactionSetailsEntity orderTransaction(Order order) {

        String orderid = order.get("id");
        String currency = order.get("currency");
        int amount = order.get("amount");

        OrderTransactionSetailsEntity orderTransactionDetails =
                new OrderTransactionSetailsEntity(
                        orderid,
                        currency,
                        amount,
                        KEY
                );

        return orderTransactionDetails;
    }
}