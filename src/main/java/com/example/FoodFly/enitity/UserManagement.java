package com.example.FoodFly.enitity;

import java.time.Instant;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class UserManagement {

	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Full first name is required")
	private String firstName;
	
	@NotBlank(message = "Full last name is required")
	private String lastName;
	
	@Column(unique = true, nullable = false)
	@NotBlank(message = "Email is required")
	private String email;

    @NotBlank(message = "Phone number is required")
	private String phoneNumber;
    
    @NotBlank(message = "Password is required")
    private String password;
    
    private String role;
    
    @Lob
    @NotNull
    private String profile;
    
    @CreatedDate
    private Instant createdAt;
    
    @LastModifiedDate
    private Instant lastModifiedAt;
    
    @Column(name = "is_approved")
    private String isApproved = "0";

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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

	public String getIsApproved() {
		return isApproved;
	}

	public void setIsApproved(String isApproved) {
		this.isApproved = isApproved;
	}

	@Override
	public String toString() {
		return "UserManagement [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", password=" + password + ", role=" + role + ", profile=" + profile
				+ ", createdAt=" + createdAt + ", lastModifiedAt=" + lastModifiedAt + ", isApproved=" + isApproved
				+ "]";
	}

	public UserManagement(Long id, @NotBlank(message = "Full first name is required") String firstName,
			@NotBlank(message = "Full last name is required") String lastName,
			@NotBlank(message = "Email is required") String email,
			@NotBlank(message = "Phone number is required") String phoneNumber,
			@NotBlank(message = "Password is required") String password, String role, @NotNull String profile,
			Instant createdAt, Instant lastModifiedAt, String isApproved) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.role = role;
		this.profile = profile;
		this.createdAt = createdAt;
		this.lastModifiedAt = lastModifiedAt;
		this.isApproved = isApproved;
	}

	public UserManagement() {
		super();
		// TODO Auto-generated constructor stub
	} 



	
}
