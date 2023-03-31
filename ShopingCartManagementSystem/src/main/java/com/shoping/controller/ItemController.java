package com.shoping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shoping.entity.Item;
import com.shoping.service.ItemService;

@RestController
public class ItemController {
	
	@Autowired
	ItemService itemService;
	@PostMapping(value = "/items")
	public Item addItems(@RequestBody Item item)
	{
		return itemService.addItems(item);
	}
	@GetMapping(value = "/items")
	public List<Item> getAllItems()
	{
		return itemService.getAllItems();
	}
	
	
	

}
