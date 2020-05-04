package com.ibm.trainning.emart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.trainning.emart.entity.Item;
import com.ibm.trainning.emart.service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {
	
	@Autowired
	ItemService itemService;
	
	@GetMapping("")
	public Page<Item> queryItems(Item item){
		Pageable pageable = PageRequest.of(0, 10);
		return itemService.queryItems(item, pageable);
	}
	
	@GetMapping("/{id}")
	public Item getItemInfo(@PathVariable("id") Long id){
		return itemService.getItemInfo(id);
	}
	
	@PostMapping("")
	public Long createItem(@RequestBody Item item) {
		return itemService.createItem(item);
	}
	
	@DeleteMapping("/{id}")
	public void deleteItem(@PathVariable("id") Long id) {
		itemService.deleteItem(id);
	}
	
	@PutMapping("/{id}")
	public void updateItem(@PathVariable("id") Long id, @RequestBody Item item) {
		item.setId(id);
		itemService.updateItem(item);
	}

}
