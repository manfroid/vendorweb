package com.bharath.vendor.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Vendor {

	@Id
	private int id;
	private String code;
	private String name;
	private String type; // REGULAR|CONTRACT
	private String email;
	private String phone;
	private String address;
}
