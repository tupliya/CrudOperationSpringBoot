package com.shoping.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class ShopingCart {
	@Id
	private int sid;
	private String sname;
	@OneToMany(mappedBy = "shopingCart",fetch = FetchType.EAGER, cascade =CascadeType.ALL)
	//@JsonIgnoreProperties("shopingCart")
	List<Item> items;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	public ShopingCart(int sid, String sname, List<Item> items) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.items = items;
	}
	public ShopingCart() {
		//super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
