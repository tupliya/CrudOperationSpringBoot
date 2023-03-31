package com.shoping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoping.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
