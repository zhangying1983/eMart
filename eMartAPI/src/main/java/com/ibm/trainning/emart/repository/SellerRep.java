package com.ibm.trainning.emart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.trainning.emart.entity.Seller;

public interface SellerRep extends JpaRepository<Seller, Long> {
}
