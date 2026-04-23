package com.example.FoodFly.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FoodFly.enitity.AssignRole;

public interface AsignRoleRepo extends JpaRepository<AssignRole, Long>{

	Optional<AssignRole> findByEmail(String email);

}
