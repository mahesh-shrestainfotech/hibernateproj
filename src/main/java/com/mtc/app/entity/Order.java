package com.mtc.app.entity;

import javax.persistence.Column;
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
@Entity
@Table(name="ordertab")
public class Order {
	
	@Id
	@Column(name="order_id")
	private Long orderId;
	@Column(name="order_status")
	private OrderStatus orderStatus;
	
	@OneToOne
	@JoinColumn(name="item_id")
	private Item item;
	
	@OneToOne
	@JoinColumn(name="billing_id")
	private Billing billing;

}
