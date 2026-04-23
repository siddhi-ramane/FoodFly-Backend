package com.example.FoodFly.enitity;



import java.time.Instant;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
public class Restaurant {

	
	@Id
	@GeneratedValue
	private Long res_id;
	

	@NotNull
	@NotBlank(message = "Full Name is required")
	@Pattern(regexp = "^[A-Za-z ]+$", message = "Name can only contain letters and spaces")
	private String res_name;
	
	@Lob
	private String Description;
	
	
	@NotBlank(message = "Owner Name is required")
	@Pattern(regexp = "^[A-Za-z ]+$", message = "Name can only contain letters and spaces")
	private String Owner_Name;
	
	   
	@NotBlank(message = "Phone number is required")
	@Pattern(regexp = "^[6-9]\\d{9}$", message = "Phone number must be 10 digits and start with 6-9")
	private String phoneNumber;
	
	
	@Lob
	private String Address;
	
	private String City;
	
	private Integer Pincode;
	
	private Double Latitude;
	
	private Double Longitude;
	
	private String Cuisine_Type;
	
	private Integer Opening_Time;
	private Integer Closing_Time;
	private String is_Open;
	private String Rating;
	private String Type;
	
	@CreatedDate
	private Instant CreatedAt;
	
	@LastModifiedDate
	private Instant UpdatedAt;
	
	
	
	
	
	
	
}
