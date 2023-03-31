package com.shoping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoping.entity.ShopingCart;

public interface ShopingCartRepository  extends JpaRepository<ShopingCart, Integer>{

}
