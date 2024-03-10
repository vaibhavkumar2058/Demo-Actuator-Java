package com.example.Vaibhav.model;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import jakarta.persistence.GeneratedValue;

@jakarta.persistence.Entity
@Entity
public class CartAPIData {
	@Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int  product_id;
    private int user_id;
    private int quantity;
	public CartAPIData(int product_id, int user_id, int quantity) {
		super();
		this.product_id = product_id;
		this.user_id = user_id;
		this.quantity = quantity;
	}
	public CartAPIData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
    
}
