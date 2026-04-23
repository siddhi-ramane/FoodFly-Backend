package com.example.FoodFly.enitity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


import jakarta.validation.constraints.Pattern;

@Entity
public class MenuItems {

	@Id
	@GeneratedValue
	private Long id;
	
	@NotBlank(message = "Item Name should not be blank")
	@Pattern(regexp = "^[A-Za-z ]+$", message = "Name can only contain letters and spaces")
	private String item_name;
	
	@Lob
	private String item_Description;
	
	
	private Integer price;
//	private String cuisionType;
	
	private String type;
	private String restaurantName;
	
	@Lob
	private String image_URL;
	
	private Integer prep_time;
	private String is_Available;
	
//	private String status;
	
	@NotNull
	@Column(nullable = false)
	private Boolean isActive;
	
	
	
	private  Boolean isDelete;
	
	
	private  Boolean isApproved;
	
	
	@ManyToOne
	@JoinColumn(name = "item_id")
	private ItemName itemid;

	@ManyToOne
	@JoinColumn(name = "cuisine_id")
	private CusineType cuisinetype;
	
	
	@PrePersist
	public void pre() {
		if(isActive == null) {
			isActive = true;
		}
		if(isDelete == null) {
			isDelete = false;
		}
		if(isApproved == null) {
			isApproved = false;
		}
	}



	public ItemName getItemid() {
		return itemid;
	}



	public CusineType getCuisinetype() {
		return cuisinetype;
	}



	public void setCuisinetype(CusineType cuisinetype) {
		this.cuisinetype = cuisinetype;
	}



	public void setItemid(ItemName itemid) {
		this.itemid = itemid;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getItem_name() {
		return item_name;
	}



	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}



	public String getItem_Description() {
		return item_Description;
	}



	public void setItem_Description(String item_Description) {
		this.item_Description = item_Description;
	}



	public Integer getPrice() {
		return price;
	}



	public void setPrice(Integer price) {
		this.price = price;
	}



//	public String getCuision_Type() {
//		return cuisionType;
//	}



//	public void setCuision_Type(String cuision_Type) {
//		this.cuisionType = cuision_Type;
//	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getRestaurantName() {
		return restaurantName;
	}



	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}



	public String getImage_URL() {
		return image_URL;
	}



	public void setImage_URL(String image_URL) {
		this.image_URL = image_URL;
	}



	public Integer getPrep_time() {
		return prep_time;
	}



	public void setPrep_time(Integer prep_time) {
		this.prep_time = prep_time;
	}



	public String getIs_Available() {
		return is_Available;
	}



	public void setIs_Available(String is_Available) {
		this.is_Available = is_Available;
	}


//
//	public String getStatus() {
//		return status;
//	}
//
//
//
//	public void setStatus(String status) {
//		this.status = status;
//	}



	public Boolean getIsActive() {
		return isActive;
	}



	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}



	public Boolean getIsDelete() {
		return isDelete;
	}



	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}



	public Boolean getIsApproved() {
		return isApproved;
	}



	public void setIsApproved(Boolean isApproved) {
		this.isApproved = isApproved;
	}






	
	

	@Override
	public String toString() {
		return "MenuItems [id=" + id + ", item_name=" + item_name + ", item_Description=" + item_Description
				+ ", price=" + price + ", cuision_Type=" +  ", type=" + type + ", restaurantName="
				+ restaurantName + ", image_URL=" + image_URL + ", prep_time=" + prep_time + ", is_Available="
				+ is_Available + ", isActive=" + isActive + ", isDelete=" + isDelete + ", isApproved=" + isApproved
				+ ", itemid=" + itemid + ", cuisinetype=" + cuisinetype + "]";
	}



	public MenuItems(Long id,
			@NotBlank(message = "Item Name should not be blank") @Pattern(regexp = "^[A-Za-z ]+$", message = "Name can only contain letters and spaces") String item_name,
			String item_Description, Integer price, String type, String restaurantName,
			String image_URL, Integer prep_time, String is_Available, @NotNull Boolean isActive, Boolean isDelete,
			Boolean isApproved, ItemName itemid, CusineType cuisinetype) {
		super();
		this.id = id;
		this.item_name = item_name;
		this.item_Description = item_Description;
		this.price = price;
//		this.cuisionType = cuisionType;
		this.type = type;
		this.restaurantName = restaurantName;
		this.image_URL = image_URL;
		this.prep_time = prep_time;
		this.is_Available = is_Available;
		this.isActive = isActive;
		this.isDelete = isDelete;
		this.isApproved = isApproved;
		this.itemid = itemid;
		this.cuisinetype = cuisinetype;
	}



	public MenuItems() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
