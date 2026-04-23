package com.example.FoodFly.enitity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull; 

	@Entity
public class ItemName {

	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer itemid;
	
	@NotNull
	private String itemName;
	
	
	@Lob
	private String itemimage;


	public Integer getItemid() {
		return itemid;
	}


	public void setItemid(Integer itemid) {
		this.itemid = itemid;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public String getItemimage() {
		return itemimage;
	}


	public void setItemimage(String itemimage) {
		this.itemimage = itemimage;
	}


	




	public ItemName(Integer itemid, @NotNull String itemName, String itemimage) {
		super();
		this.itemid = itemid;
		this.itemName = itemName;
		this.itemimage = itemimage;
	}


	@Override
	public String toString() {
		return "ItemName [itemid=" + itemid + ", itemName=" + itemName + ", itemimage=" + itemimage + "]";
	}


	public ItemName() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
