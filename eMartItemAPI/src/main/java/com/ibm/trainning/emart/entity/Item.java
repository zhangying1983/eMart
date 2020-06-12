package com.ibm.trainning.emart.entity;

import java.io.File;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter
	@Setter
	private Long id;

	@Getter
	@Setter
	private File itemImage;

	@Getter
	@Setter
	private String itemName;

	@Getter
	@Setter
	private String category;

	@Getter
	@Setter
	private BigDecimal price;

	@Getter
	@Setter
	private Integer stockQuantity;

	@Getter
	@Setter
	private String description;

}
