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
@Table(name="creditcard")
public class CreditCard {
	
	@Id
	private Long creditCardId;
	private String nameOnCard;
	private String accountNumber;
	private String expirationMonth;
	private String expirationYear;
	private String securityCode;
	
	public CreditCard() {
		// TODO Auto-generated constructor stub
	}

	
}
