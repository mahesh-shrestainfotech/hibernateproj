package com.mtc.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @EqualsAndHashCode
@Table(name="billing")
@Entity
public class Billing {
	
	@Id
	private Long billingId;
	
	@OneToOne
	@JoinColumn(name="address_id")
	private Address billingAddress;
	
	@OneToOne
	@JoinColumn(name="creditCard_id")
	private CreditCard creditCard;
	
	public Billing() {
		// TODO Auto-generated constructor stub
	}


}
