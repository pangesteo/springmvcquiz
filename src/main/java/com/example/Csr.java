package com.example;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Csr {
	private Long id;
	private String name;
	private String category;
	private String location;
	private Date plandate;
	
	protected Csr() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public Date getPlandate() {
		return plandate;
	}
	
	public void setPlandate(Date plandate) {
		this.plandate = plandate;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
}
	
	
	
	
	

