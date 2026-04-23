package com.example.FoodFly.enitity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;


@Entity
public class AssignRole {

	
	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	private Long roleid;
	
	@NotBlank
	private String username;
	
	
	private String role;
	
	@NotBlank
	private String password;
	
	@NotBlank(message = "Email is required")
	private String email;

	public Long getRoleid() {
		return roleid;
	}

	public void setRoleid(Long roleid) {
		this.roleid = roleid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "AssignRole [roleid=" + roleid + ", username=" + username + ", role=" + role + ", password=" + password
				+ ", email=" + email + "]";
	}

	public AssignRole(Long roleid, @NotBlank String username, @NotBlank String role, @NotBlank String password,
			@NotBlank(message = "Email is required") String email) {
		super();
		this.roleid = roleid;
		this.username = username;
		this.role = role;
		this.password = password;
		this.email = email;
	}

	public AssignRole() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
