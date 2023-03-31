package com.shoping.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shoping.entity.Item;
import com.shoping.entity.ShopingCart;

@Service
public interface ItemService {
	public Item addItems(Item items);
	public List<Item> getAllItems();

}
