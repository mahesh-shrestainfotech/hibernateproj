package com.mtc.app.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.mtc.app.entity.Product;
import com.mtc.app.entity.Supplier;

public class HibernateUtil {
	
	
	private static final SessionFactory SESSION_FACTORY;
	
	static {
		Configuration configuration = new Configuration();
		
		//loads hibernate.cfg.xml file from classpath
		configuration.configure();
		
		configuration.addAnnotatedClass(Product.class);
		configuration.addAnnotatedClass(Supplier.class);
		
		//starting essential hibernate services
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		
		SESSION_FACTORY = configuration.buildSessionFactory(serviceRegistry);
		
	}
	
	
	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}
	

}
