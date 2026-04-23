package com.example.FoodFly.dto;

import java.time.Instant;

public class UserManagementResdto {

	 private Long userId;
	    private String firstName;
	    private String lastName;
	    private String email;
	    private String phoneNumber;
	    private String role;       
	    private String profile;    
	    private Instant createdAt; 
	    private Instant lastModifiedAt;
		public UserManagementResdto(Long userId, String firstName, String lastName, String email, String phoneNumber,
				String role, String profile, Instant createdAt, Instant lastModifiedAt) {
			super();
			this.userId = userId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.phoneNumber = phoneNumber;
			this.role = role;
			this.profile = profile;
			this.createdAt = createdAt;
			this.lastModifiedAt = lastModifiedAt;
		}
		public Long getUserId() {
			return userId;
		}
		public void setUserId(Long userId) {
			this.userId = userId;
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
		public UserManagementResdto() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "UserManagementResdto [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName
					+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", role=" + role + ", profile=" + profile
					+ ", createdAt=" + createdAt + ", lastModifiedAt=" + lastModifiedAt + "]";
		} 
	    
	    
	
	
}
