package com.tnsif.springioc;

import org.springframework.stereotype.Component;

@Component
public class Customer1 {
	private int id;
	private String name;
	private String city;
	
	public Customer1() {
		System.out.println("Customer1 class object has been created...");
	}
	
	public void order() {
		System.out.println("Customer1 ordering the product...");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

}
