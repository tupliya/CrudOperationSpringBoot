package com.shoping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shoping.entity.ShopingCart;
import com.shoping.service.ShopingCartServices;

@RestController
public class ShopingCartController {
	
	@Autowired
	ShopingCartServices shopingCartServices;
	
	@PostMapping(value = "/shopings")
	public ShopingCart addShopingCart(@RequestBody ShopingCart shopingCart)
	{
		return shopingCartServices.addShopingCart(shopingCart);
	}
	@GetMapping(value = "/shopings")
	public List<ShopingCart> getAllShopingCart()
	{
		return shopingCartServices.getAllShopingCarts();
	}
	

}
