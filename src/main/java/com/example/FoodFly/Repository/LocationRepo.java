package com.example.FoodFly.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.FoodFly.enitity.Location;

public interface LocationRepo extends JpaRepository<Location, Long> {

}
