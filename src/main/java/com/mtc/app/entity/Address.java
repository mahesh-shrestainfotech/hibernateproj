package com.mtc.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @EqualsAndHashCode
@Entity
@Table(name="address")
public class Address {

	@Id
	private int addressId;
	private String streetName1;
	private String streetName2;
	private String city;
	private String state;
	private String zipcode;
	private String phone;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

		
}
