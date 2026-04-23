package com.example.FoodFly.service;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.example.FoodFly.enitity.OrderTransactionSetailsEntity;
import com.razorpay.Order;
import com.razorpay.RazorpayClient;



@Service
public class OrderServices {

private static final String KEY="rzp_test_S6xwpQtV10MT8F";
private static final String KEY_SECRET="eyYM61GKi3OtXFCOzEqgkxBy";
private static final String CURRENCY="INR";


public OrderTransactionSetailsEntity orderCreateTransaction(double amount)
{
try {
JSONObject jsonObject=new JSONObject();
jsonObject.put("amount", amount*100);
jsonObject.put("currency", CURRENCY);
RazorpayClient razorpayClient=new RazorpayClient(KEY,

KEY_SECRET);

Order order= razorpayClient.orders.create(jsonObject);
return orderTransaction(order);
} catch (Exception e) {
// TODO Auto-generated catch block
System.out.println(e.getMessage());
}
return null;
}


private OrderTransactionSetailsEntity orderTransaction(Order order)
{
String orderid=order.get("id");
String currency=order.get("currency");
int amount=order.get("amount");
OrderTransactionSetailsEntity orderTransactionDetails=new

OrderTransactionSetailsEntity(orderid, currency, amount,KEY);

return orderTransactionDetails;
}

}

