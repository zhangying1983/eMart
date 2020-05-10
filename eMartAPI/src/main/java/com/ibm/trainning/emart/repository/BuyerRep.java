package com.ibm.trainning.emart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.trainning.emart.entity.Buyer;
import com.ibm.trainning.emart.entity.User;

public interface BuyerRep extends JpaRepository<Buyer, Long> {
}
