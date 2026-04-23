package com.example.FoodFly.enitity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Rider {

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank(message = "Name is required")
    @Pattern(regexp = "^[A-Za-z ]+$", message = "Name can only contain letters and spaces")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "Phone number is required")
    @Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be 10 digits")
    private String phone;

    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password must be at least 6 characters")
    private String password;



    public Rider(String name, String email, String phone, String password, String vehicleType, String licenseNumber) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;

    }


    public Long getId() {
    	return id; 
    	}
    public void setId(Long id) { 
    	this.id = id; 
    	}

    public String getName() { 
    	return name; 
    	}
    public void setName(String name) { 
    	this.name = name; 
    	}

    public String getEmail() { 
    	return email;
    	}
    public void setEmail(String email) { 
    	this.email = email; 
    	}

    public String getPhone() { 
    	return phone; 
    	}
    public void setPhone(String phone) { 
    	this.phone = phone; 
    	}

    public String getPassword() {
    	return password; 
    	}
    public void setPassword(String password) {
    	this.password = password;
    	}


	public Rider() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Rider [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", password=" + password
				+ "]";
	}

}



