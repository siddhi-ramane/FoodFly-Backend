package com.example.FoodFly.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import com.example.FoodFly.enitity.MenuItems;

import jakarta.transaction.Transactional;

public interface RestaurantRepo extends JpaRepository<MenuItems, Long>{

	

//	void deleteByIdAndIsDelete(Long id, Boolean isDelete);


	

}
