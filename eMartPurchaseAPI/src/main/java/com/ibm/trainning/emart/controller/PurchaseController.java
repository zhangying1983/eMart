package com.ibm.trainning.emart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.trainning.emart.entity.Purchase;
import com.ibm.trainning.emart.service.PurchaseService;

@RestController
@RequestMapping("/api/item")
public class PurchaseController {
	
	@Autowired
	PurchaseService itemService;
	
	@GetMapping("")
	public Page<Purchase> queryItems(Purchase item){
		return null;
	}
	
	@GetMapping("/{id}")
	public Purchase getItemInfo(@PathVariable("id") Long id){
		return null;
	}
	
	@PostMapping("")
	public Long createItem(@RequestBody Purchase item) {
		return null;
	}
	
	@DeleteMapping("/{id}")
	public void deleteItem(@PathVariable("id") Long id) {
	}
	
	@PutMapping("/{id}")
	public void updateItem(@PathVariable("id") Long id, @RequestBody Purchase item) {
	}

}
