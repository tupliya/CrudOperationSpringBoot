package com.shoping.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Item {
	@Id
	private int item_id;
	private String item_name;
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JsonIgnoreProperties("items")
	@JoinColumn(name = "sid")
	ShopingCart shopingCart;
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public ShopingCart getShopingCart() {
		return shopingCart;
	}
	public void setShopingCart(ShopingCart shopingCart) {
		this.shopingCart = shopingCart;
	}
	public Item(int item_id, String item_name, ShopingCart shopingCart) {
		super();
		this.item_id = item_id;
		this.item_name = item_name;
		this.shopingCart = shopingCart;
	}
	public Item() {
		//super();
		// TODO Auto-generated constructor stub
	}
	
	

}
