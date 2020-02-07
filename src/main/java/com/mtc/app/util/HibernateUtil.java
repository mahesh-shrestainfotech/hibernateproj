package com.mtc.app.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.mtc.app.entity.Address;
import com.mtc.app.entity.Bid;
import com.mtc.app.entity.Billing;
import com.mtc.app.entity.CreditCard;
import com.mtc.app.entity.Item;
import com.mtc.app.entity.Order;
import com.mtc.app.entity.Product;
import com.mtc.app.entity.Supplier;

public class HibernateUtil {
	
	
	private static final SessionFactory SESSION_FACTORY;
	
	static {
		Configuration configuration = new Configuration();
		
		//loads hibernate.cfg.xml file from classpath
		configuration.configure();
		
		//configuration.addAnnotatedClass(Product.class);
	//	configuration.addAnnotatedClass(Supplier.class);
		configuration.addAnnotatedClass(Item.class);
		configuration.addAnnotatedClass(Bid.class);
		configuration.addAnnotatedClass(CreditCard.class);
		configuration.addAnnotatedClass(Address.class);
		configuration.addAnnotatedClass(Billing.class);
		configuration.addAnnotatedClass(Order.class);
		//configuration.addPackage("com.mtc.app.entity");
		
		//starting essential hibernate services
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		
		SESSION_FACTORY = configuration.buildSessionFactory(serviceRegistry);
		
	}
	
	
	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}
	

}
