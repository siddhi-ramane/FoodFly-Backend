package com.example.FoodFly.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FoodFly.enitity.FoodOrders;




public interface OrderRepo extends JpaRepository<FoodOrders, Integer>{

}
