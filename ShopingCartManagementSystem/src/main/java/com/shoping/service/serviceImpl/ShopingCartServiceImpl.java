package com.shoping.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shoping.entity.ShopingCart;
import com.shoping.repository.ShopingCartRepository;
import com.shoping.service.ShopingCartServices;

@Repository
public class ShopingCartServiceImpl  implements ShopingCartServices{
	
	@Autowired
	ShopingCartRepository shopingCartRepository;

	@Override
	public ShopingCart addShopingCart(ShopingCart shopingcart) {
		// TODO Auto-generated method stub
		return shopingCartRepository.save(shopingcart);
	}

	@Override
	public List<ShopingCart> getAllShopingCarts() {
		// TODO Auto-generated method stub
		return shopingCartRepository.findAll();
	}

	

	
	

	

}
