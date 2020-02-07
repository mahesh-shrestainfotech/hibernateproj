package com.mtc.app.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @EqualsAndHashCode
@Table(name="item")
@Entity
public class Item implements Serializable{

	@Id
	private int id;
	private String name;
	private String description;	
	private LocalDate bidStartDate;
	private LocalDate bidEndDate;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "item")
	private Set<Bid> bids = new HashSet<Bid>();
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(int id, String name, String description, LocalDate bidStartDate, LocalDate bidEndDate) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.bidStartDate = bidStartDate;
		this.bidEndDate = bidEndDate;
	}
	
	
	
	
}
