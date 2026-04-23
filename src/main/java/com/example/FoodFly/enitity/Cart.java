package com.example.FoodFly.enitity;

import java.time.Instant;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cart_id")
	private Long cartid;
	
	@NotNull
	@Column(nullable = false)
	private Integer quantity;
	
	@NotNull
	@Column(nullable = false)
	private String area;
	
	@CreatedDate
	private Instant createdDate;
	
	@LastModifiedDate
	private Instant updatedDate;
	
	
	@Column(nullable = 	true)
	private Double price;
	
	@NotNull
	@Column(nullable = false)
	private Double total_amt;
	
	@Lob
	private String menuimg;
	

	@ManyToOne 
	@JoinColumn(name = "customerid", nullable = false) 
//	@JsonIgnore 
	@JsonBackReference
	private Registration user ;
	
	
	public Cart(Long cartid, @NotNull Integer quantity, @NotNull String area, Instant createdDate, Instant updatedDate,
			@NotNull Double price, @NotNull Double total_amt, String menuimg, Registration user, MenuItems menu) {
		super();
		this.cartid = cartid;
		this.quantity = quantity;
		this.area = area;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.price = price;
		this.total_amt = total_amt;
		this.menuimg = menuimg;
		this.user = user;
		this.menu = menu;
	}


	public String getMenuimg() {
		return menuimg;
	}


	public void setMenuimg(String menuimg) {
		this.menuimg = menuimg;
	}


	@ManyToOne
	@JoinColumn(name = "menuid", nullable = false)
	private MenuItems menu;


	public Long getCartid() {
		return cartid;
	}


	public void setCartid(Long cartid) {
		this.cartid = cartid;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public Instant getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Instant createdDate) {
		this.createdDate = createdDate;
	}


	public Instant getUpdatedDate() {
		return updatedDate;
	}


	public void setUpdatedDate(Instant updatedDate) {
		this.updatedDate = updatedDate;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public Double getTotal_amt() {
		return total_amt;
	}


	public void setTotal_amt(Double total_amt) {
		this.total_amt = total_amt;
	}


	public Registration getUser() {
		return user;
	}


	public void setUser(Registration user) {
		this.user = user;
	}


	public MenuItems getMenu() {
		return menu;
	}


	public void setMenu(MenuItems menu) {
		this.menu = menu;
	}


	@Override
	public String toString() {
		return "Cart [cartid=" + cartid + ", quantity=" + quantity + ", area=" + area + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + ", price=" + price + ", total_amt=" + total_amt + ", menuimg="
				+ menuimg + ", user=" + user + ", menu=" + menu + "]";
	}


	public Cart(Long cartid, @NotNull Integer quantity, @NotNull String area, Instant createdDate, Instant updatedDate,
			@NotNull Double price, @NotNull Double total_amt, Registration user, MenuItems menu) {
		super();
		this.cartid = cartid;
		this.quantity = quantity;
		this.area = area;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.price = price;
		this.total_amt = total_amt;
		this.user = user;
		this.menu = menu;
	}


	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
	
}
