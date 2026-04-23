package com.example.FoodFly.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FoodFly.enitity.MenuItems;

public interface AdminRepo extends JpaRepository<MenuItems, Long> {

}
