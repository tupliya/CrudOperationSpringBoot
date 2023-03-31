package com.shoping.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shoping.entity.ShopingCart;

@Service
public interface ShopingCartServices {
	
	public ShopingCart addShopingCart(ShopingCart shopingcart);
	public List<ShopingCart> getAllShopingCarts();
//	public void deleteShopingCart(int sid);
//	public ShopingCart updateShopingCart(ShopingCart shopingCart);
//	public ShopingCart findShopingCartById(int sid);

}
