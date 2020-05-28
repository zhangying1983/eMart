package com.ibm.trainning.emart.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.trainning.emart.entity.Purchase;

public interface PurchaseRep extends JpaRepository<Purchase, Long> {

}
