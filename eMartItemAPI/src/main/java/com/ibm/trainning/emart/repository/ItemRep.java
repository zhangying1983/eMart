package com.ibm.trainning.emart.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.trainning.emart.entity.Item;

public interface ItemRep extends JpaRepository<Item, Long> {

	public Page<Item> findAllByItemNameLike(String itemName, Pageable pageable);
}
