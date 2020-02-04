package com.mtc.app.entity;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="product")
@Getter @Setter @ToString @EqualsAndHashCode
public class Product implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="price")
	private Float price;
	@Column(name="description")
	private String description;
	@Column(name="quantity")
	private Integer quantity;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}	
	
	public Product(Integer id, String name, Float price, String description, Integer quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.quantity = quantity;
	}


	

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="supplier_id")
	private Supplier supplier;
}



