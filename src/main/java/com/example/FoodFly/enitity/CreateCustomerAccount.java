//package com.example.FoodFly.enitity;
//
//import jakarta.validation.constraints.Email;
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.Pattern;
//
//import java.time.Instant;
//
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.LastModifiedDate;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.Id;
//import jakarta.persistence.Lob;
//
//
//@Entity
//public class CreateCustomerAccount {
//
//    @Id
//    @GeneratedValue
//    private Long c_id;
//    
//
//    @NotBlank(message = "Full name is required")
//	@Pattern(regexp = "^[A-Za-z ]+$", message = "Name can only contain letters and spaces")
//	private String Name;
//    
//	
//	@NotBlank(message = "Last name is required")
//	@Pattern(regexp = "^[A-Za-z ]+$", message = "Name can only contain letters and spaces")
//	private String Last_Name;
//	
//
//    @NotBlank(message = "Password is required")
//    @Pattern(
//        regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$",
//        message = "Password must be at least 8 chars, contain upper & lower case letters, a number, and a special character"
//    )
//    private String password;
//    
//
//    @NotBlank(message = "Email is required")
//    @Email(message = "Enter a valid email")
//    private String email;
//    
//
//    @NotBlank(message = "Phone number is required")
//	@Pattern(regexp = "^[6-9]\\d{9}$", message = "Phone number must be 10 digits and start with 6-9")
//	private String phoneNumber;
//    
//	
//	private String State;
//	
//	private String Country;
//	
//	
//	@Lob	
//	private String Address;
//	
//	private Integer Pincode;
//	
//	
//	private Double Latitude;
//	
//	private Double Longitude;
//	
//	@CreatedDate
//	private Instant AddedOn;
//	
//	@LastModifiedDate
//	private Instant UpdatedOn;
//
//	public Long getC_id() {
//		return c_id;
//	}
//
//	public void setC_id(Long c_id) {
//		this.c_id = c_id;
//	}
//
//	public String getName() {
//		return Name;
//	}
//
//	public void setName(String name) {
//		Name = name;
//	}
//
//	public String getLast_Name() {
//		return Last_Name;
//	}
//
//	public void setLast_Name(String last_Name) {
//		Last_Name = last_Name;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getPhoneNumber() {
//		return phoneNumber;
//	}
//
//	public void setPhoneNumber(String phoneNumber) {
//		this.phoneNumber = phoneNumber;
//	}
//
//	public String getState() {
//		return State;
//	}
//
//	public void setState(String state) {
//		State = state;
//	}
//
//	public String getCountry() {
//		return Country;
//	}
//
//	public void setCountry(String country) {
//		Country = country;
//	}
//
//	public String getAddress() {
//		return Address;
//	}
//
//	public void setAddress(String address) {
//		Address = address;
//	}
//
//	public Integer getPincode() {
//		return Pincode;
//	}
//
//	public void setPincode(Integer pincode) {
//		Pincode = pincode;
//	}
//
//	public Double getLatitude() {
//		return Latitude;
//	}
//
//	public void setLatitude(Double latitude) {
//		Latitude = latitude;
//	}
//
//	public Double getLongitude() {
//		return Longitude;
//	}
//
//	public void setLongitude(Double longitude) {
//		Longitude = longitude;
//	}
//
//	public Instant getAddedOn() {
//		return AddedOn;
//	}
//
//	public void setAddedOn(Instant addedOn) {
//		AddedOn = addedOn;
//	}
//
//	public Instant getUpdatedOn() {
//		return UpdatedOn;
//	}
//
//	public void setUpdatedOn(Instant updatedOn) {
//		UpdatedOn = updatedOn;
//	}
//
//	@Override
//	public String toString() {
//		return "CreateCustomerAccount [c_id=" + c_id + ", Name=" + Name + ", Last_Name=" + Last_Name + ", password="
//				+ password + ", email=" + email + ", phoneNumber=" + phoneNumber + ", State=" + State + ", Country="
//				+ Country + ", Address=" + Address + ", Pincode=" + Pincode + ", Latitude=" + Latitude + ", Longitude="
//				+ Longitude + ", AddedOn=" + AddedOn + ", UpdatedOn=" + UpdatedOn + "]";
//	}
//
//	public CreateCustomerAccount(Long c_id,
//			@NotBlank(message = "Full name is required") @Pattern(regexp = "^[A-Za-z ]+$", message = "Name can only contain letters and spaces") String name,
//			@NotBlank(message = "Last name is required") @Pattern(regexp = "^[A-Za-z ]+$", message = "Name can only contain letters and spaces") String last_Name,
//			@NotBlank(message = "Password is required") @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$", message = "Password must be at least 8 chars, contain upper & lower case letters, a number, and a special character") String password,
//			@NotBlank(message = "Email is required") @Email(message = "Enter a valid email") String email,
//			@NotBlank(message = "Phone number is required") @Pattern(regexp = "^[6-9]\\d{9}$", message = "Phone number must be 10 digits and start with 6-9") String phoneNumber,
//			String state, String country, String address, Integer pincode, Double latitude, Double longitude,
//			Instant addedOn, Instant updatedOn) {
//		super();
//		this.c_id = c_id;
//		Name = name;
//		Last_Name = last_Name;
//		this.password = password;
//		this.email = email;
//		this.phoneNumber = phoneNumber;
//		State = state;
//		Country = country;
//		Address = address;
//		Pincode = pincode;
//		Latitude = latitude;
//		Longitude = longitude;
//		AddedOn = addedOn;
//		UpdatedOn = updatedOn;
//	}
//
//	public CreateCustomerAccount() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
//    
//    
//   
//}
//
