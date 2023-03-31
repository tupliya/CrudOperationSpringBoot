package com.shoping.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shoping.entity.Item;
import com.shoping.repository.ItemRepository;
import com.shoping.service.ItemService;

@Repository
public class ItemServiceImpl  implements ItemService{
	
	@Autowired
	ItemRepository itemRepository;

	@Override
	public Item addItems(Item items) {
		// TODO Auto-generated method stub
		return itemRepository.save(items);
	}

	@Override
	public List<Item> getAllItems() {
		// TODO Auto-generated method stub
		return itemRepository.findAll();
	}

}
