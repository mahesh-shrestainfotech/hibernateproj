package com.mtc.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@Table(name="supplier")
@Entity
public class Supplier {
	
	@Id
	private int id;
	private String name;
	
	public Supplier() {
		// TODO Auto-generated constructor stub
	}
	
	

}
