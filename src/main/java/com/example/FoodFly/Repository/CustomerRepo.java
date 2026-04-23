package com.example.FoodFly.Repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.FoodFly.enitity.Registration;

public interface CustomerRepo extends JpaRepository<Registration, Long> {

	Registration save(Registration regis);

	Optional<Registration> findByEmail(String email);

	

	

}
