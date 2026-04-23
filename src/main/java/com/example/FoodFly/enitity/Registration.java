package com.example.FoodFly.enitity;

import java.time.Instant;
import java.util.Optional;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Registration {

	
	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	@JsonManagedReference
	private Long id;
	
	
	@NotBlank(message = "Full name is required")
	@Pattern(regexp = "^[A-Za-z ]+$", message = "Name can only contain letters and spaces")
	private String name;
	
	@NotBlank(message = "Last name is required")
	@Pattern(regexp = "^[A-Za-z ]+$", message = "Name can only contain letters and spaces")
	private String lastName;
	
	@NotBlank(message = "Phone number is required")
	@Pattern(regexp = "^[6-9]\\d{9}$", message = "Phone number must be 10 digits and start with 6-9")
	private String phoneNumber;
	
	
	@NotBlank(message = "Email is required")
	@Email(message = "Enter a valid email")
	private String email;
	
	 @Column(name = "is_approved") 
	    private String isApproved = "0"; 

	   

    @Pattern(
        regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$",
        message = "Password must be at least 8 chars, contain upper & lower case letters, a number, and a special character"
    )
	@NotBlank(message = "Password is required")
    private String password;
    
    private String role;
    
    @Lob
    private String profile;
    
    private String area;
	
	private String state;
	
	
	private String country;
	
	@Lob	
	private String address;
	

	
	
	  @CreatedDate
	    private Instant createdAt;
	    
	    @LastModifiedDate
	    private Instant lastModifiedAt;

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

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getIsApproved() {
			return isApproved;
		}

		public void setIsApproved(String isApproved) {
			this.isApproved = isApproved;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getProfile() {
			return profile;
		}

		public void setProfile(String profile) {
			this.profile = profile;
		}

		public String getArea() {
			return area;
		}

		public void setArea(String area) {
			this.area = area;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public Instant getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(Instant createdAt) {
			this.createdAt = createdAt;
		}

		public Instant getLastModifiedAt() {
			return lastModifiedAt;
		}

		public void setLastModifiedAt(Instant lastModifiedAt) {
			this.lastModifiedAt = lastModifiedAt;
		}

		@Override
		public String toString() {
			return "Registration [id=" + id + ", name=" + name + ", lastName=" + lastName + ", phoneNumber="
					+ phoneNumber + ", email=" + email + ", isApproved=" + isApproved + ", password=" + password
					+ ", role=" + role + ", profile=" + profile + ", area=" + area + ", state=" + state + ", country="
					+ country + ", address=" + address + ", createdAt=" + createdAt + ", lastModifiedAt="
					+ lastModifiedAt + "]";
		}

		public Registration(Long id,
				@NotBlank(message = "Full name is required") @Pattern(regexp = "^[A-Za-z ]+$", message = "Name can only contain letters and spaces") String name,
				@NotBlank(message = "Last name is required") @Pattern(regexp = "^[A-Za-z ]+$", message = "Name can only contain letters and spaces") String lastName,
				@NotBlank(message = "Phone number is required") @Pattern(regexp = "^[6-9]\\d{9}$", message = "Phone number must be 10 digits and start with 6-9") String phoneNumber,
				@NotBlank(message = "Email is required") @Email(message = "Enter a valid email") String email,
				String isApproved,
				@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$", message = "Password must be at least 8 chars, contain upper & lower case letters, a number, and a special character") @NotBlank(message = "Password is required") String password,
				String role, String profile, String area, String state, String country, String address,
				Instant createdAt, Instant lastModifiedAt) {
			super();
			this.id = id;
			this.name = name;
			this.lastName = lastName;
			this.phoneNumber = phoneNumber;
			this.email = email;
			this.isApproved = isApproved;
			this.password = password;
			this.role = role;
			this.profile = profile;
			this.area = area;
			this.state = state;
			this.country = country;
			this.address = address;
			this.createdAt = createdAt;
			this.lastModifiedAt = lastModifiedAt;
		}

		public Registration() {
			super();
			// TODO Auto-generated constructor stub
		}

//		public Optional<MenuItems> findById(Long custoid) {
//			// TODO Auto-generated method stub
//			return null;
//		}
	    
	    
}
