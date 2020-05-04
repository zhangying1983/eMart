package com.ibm.trainning.emart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.ibm.trainning.emart.entity.Item;
import com.ibm.trainning.emart.repository.ItemRep;

@Service
public class ItemService  {
	
	@Autowired
	ItemRep itemRep;
	
	public Page<Item> queryItems(Item item, Pageable pageable){
		// TODO it's better to user <code> itemRep.findAll(Example.of(item), pageable); </code>
		if(StringUtils.isEmpty(item.getItemName())) {
			return itemRep.findAll(pageable);
		}	
		return itemRep.findAllByItemNameLike("%" + item.getItemName() + "%", pageable);
	}
	
	public Long createItem(Item item) {
		return itemRep.save(item).getId();
	}
	
	public void deleteItem(Long id) {
		itemRep.deleteById(id);
	}
	
	public void updateItem(Item item) {
		itemRep.save(item);
	}
	
	public Item getItemInfo(Long id) {
		return itemRep.getOne(id);
	}

}
