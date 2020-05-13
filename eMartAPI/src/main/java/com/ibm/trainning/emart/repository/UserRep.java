package com.ibm.trainning.emart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.trainning.emart.entity.User;

public interface UserRep extends JpaRepository<User, Long> {
	
	public User findOneByUsername(String username);
}
