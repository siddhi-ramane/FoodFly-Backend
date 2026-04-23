package com.example.FoodFly.enitity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.validation.constraints.NotNull; 

@Entity
public class CusineType {

	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer cusineTypeid;
	
	@NotNull
	private String cusineTypeName;
	
	
	@Lob
	private String cusineTypeimage;


	public Integer getCusineTypeid() {
		return cusineTypeid;
	}


	public void setCusineTypeid(Integer cusineTypeid) {
		this.cusineTypeid = cusineTypeid;
	}


	public String getCusineTypeName() {
		return cusineTypeName;
	}


	public void setCusineTypeName(String cusineTypeName) {
		this.cusineTypeName = cusineTypeName;
	}


	public String getCusineTypeimage() {
		return cusineTypeimage;
	}


	public void setCusineTypeimage(String cusineTypeimage) {
		this.cusineTypeimage = cusineTypeimage;
	}


	@Override
	public String toString() {
		return "CusineType [cusineTypeid=" + cusineTypeid + ", cusineTypeName=" + cusineTypeName + ", cusineTypeimage="
				+ cusineTypeimage + "]";
	}


	public CusineType(Integer cusineTypeid, @NotNull String cusineTypeName, String cusineTypeimage) {
		super();
		this.cusineTypeid = cusineTypeid;
		this.cusineTypeName = cusineTypeName;
		this.cusineTypeimage = cusineTypeimage;
	}


	public CusineType() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
