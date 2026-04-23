package com.example.FoodFly.dto;



import jakarta.persistence.Lob;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class UserManagementReqdto {

	@Pattern(regexp = "^[A-Za-z ]+$", message = "Name can only contain letters and spaces")
	@Size(min = 2, max = 30)
	private String firstName;
	

	@Pattern(regexp = "^[A-Za-z ]+$", message = "Name can only contain letters and spaces")
	@Size(min = 2, max = 30)
	private String lastName;
	
	@Email(message = "Enter a valid email")
	private String email;
	

    @Pattern(
        regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$",
        message = "Password must be at least 8 chars, contain upper & lower case letters, a number, and a special character"
    )
	private String password;
    

	@Pattern(regexp = "^[6-9]\\d{9}$", message = "Phone number must be 10 digits and start with 6-9")
	private String phoneNumber;
	
	@Lob
	private String profile;
	
	
	
//	 @CreatedDate
//	 private Instant createdAt;
//	    
//	 @LastModifiedDate
//	 private Instant lastModifiedAt;

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

	 public String getPassword() {
		 return password;
	 }

	 public void setPassword(String password) {
		 this.password = password;
	 }

	 public String getPhoneNumber() {
		 return phoneNumber;
	 }

	 public void setPhoneNumber(String phoneNumber) {
		 this.phoneNumber = phoneNumber;
	 }

	 public String getProfile() {
		 return profile;
	 }

	 public void setProfile(String profile) {
		 this.profile = profile;
	 }

//	 public Instant getCreatedAt() {
//		 return createdAt;
//	 }
//
//	 public void setCreatedAt(Instant createdAt) {
//		 this.createdAt = createdAt;
//	 }
//
//	 public Instant getLastModifiedAt() {
//		 return lastModifiedAt;
//	 }
//
//	 public void setLastModifiedAt(Instant lastModifiedAt) {
//		 this.lastModifiedAt = lastModifiedAt;
//	 }

	 @Override
	 public String toString() {
		return "UserManagementReqdto [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", phoneNumber=" + phoneNumber + ", profile=" + profile + ", ]";
	 }

	 public UserManagementReqdto(
			@Pattern(regexp = "^[A-Za-z ]+$", message = "Name can only contain letters and spaces") @Size(min = 2, max = 30) String firstName,
			@Pattern(regexp = "^[A-Za-z ]+$", message = "Name can only contain letters and spaces") @Size(min = 2, max = 30) String lastName,
			@Email(message = "Enter a valid email") String email,
			@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$", message = "Password must be at least 8 chars, contain upper & lower case letters, a number, and a special character") String password,
			@Pattern(regexp = "^[6-9]\\d{9}$", message = "Phone number must be 10 digits and start with 6-9") String phoneNumber,
			String profile) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.profile = profile;
//		this.createdAt = createdAt;
//		this.lastModifiedAt = lastModifiedAt;
	 }

	 public UserManagementReqdto() {
		super();
		// TODO Auto-generated constructor stub
	 }
	 
	 
	
	
	
}
