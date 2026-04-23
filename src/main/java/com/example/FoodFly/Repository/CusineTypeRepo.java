package com.example.FoodFly.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FoodFly.enitity.CusineType;

public interface CusineTypeRepo extends JpaRepository<CusineType, Integer> {

}
