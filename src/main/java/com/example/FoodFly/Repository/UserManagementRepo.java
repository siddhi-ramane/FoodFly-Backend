package com.example.FoodFly.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FoodFly.enitity.UserManagement;

public interface UserManagementRepo extends JpaRepository< UserManagement, Long>{


}
