package com.ibm.trainning.emart.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.trainning.emart.entity.Buyer;
import com.ibm.trainning.emart.entity.Item;
import com.ibm.trainning.emart.entity.Seller;
import com.ibm.trainning.emart.entity.User;
import com.ibm.trainning.emart.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/{username}")
	public User getItemInfo(@PathVariable("username") String username){
		return userService.getUser(username);
	}
	
	
	

	@PostMapping("/buyer")
	public Long createBuyer(@RequestBody Buyer user) {
		return userService.createBuyer(user);
	}
	@PostMapping("/seller")
	public Long createBuyer(@RequestBody Seller user) {
		return userService.createSell(user);
	}
	
	@GetMapping("/current")
	public User getCurrent(Principal principal) {
		String username = principal.getName();
		return userService.getUser(username);
	}
	
	@DeleteMapping("/{id}")
	public void deleteItem(@PathVariable("id") Long id) {
//		itemService.deleteItem(id);
	}
	
	@PutMapping("/{id}")
	public void updateItem(@PathVariable("id") Long id, @RequestBody Item item) {
		item.setId(id);
//		itemService.updateItem(item);
	}

}
