package com.mtc.app.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @EqualsAndHashCode
@Table(name="bid")
@Entity
public class Bid implements Serializable{
	
	@Id
	private int id;
	private float bidPrice;
	
	public Bid() {
		// TODO Auto-generated constructor stub
	}

	public Bid(int id, float bidPrice) {
		super();
		this.id = id;
		this.bidPrice = bidPrice;
	}

	@ManyToOne
	@JoinColumn(name="item_id")
	private Item item;
	
	

}
