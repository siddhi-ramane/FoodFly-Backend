package com.example.FoodFly.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FoodFly.enitity.Cart;
import com.example.FoodFly.enitity.MenuItems;
import com.example.FoodFly.enitity.Registration;
import com.example.FoodFly.enitity.UserManagement;

public interface CartRepo extends JpaRepository<Cart, Long> {

	

	Cart findByUserAndMenu(Registration u, MenuItems r);
//	List<Cart> findByCustomerid(Long customerid);
//	List<Cart> findByCustomerid(Long userid);
//	List<Cart> findByUser_Id(Long userid);
//	List<Cart> findByUser_Id(Long userid);

	List<Cart> findByUser_Id(Long id);
}
