package com.ibm.trainning.emart.entity;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Seller extends User{
	@Getter
	@Setter
	private String companyName;
	@Getter
	@Setter
	private String gstin;
	@Getter
	@Setter
	private String brief;
	@Getter
	@Setter
	private String postAddr;
	@Getter
	@Setter
	private String webSite;
	@Getter
	@Setter
	private String contactNumber;
}
