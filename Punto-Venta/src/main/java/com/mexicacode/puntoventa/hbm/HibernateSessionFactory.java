package com.mexicacode.puntoventa.hbm;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateSessionFactory {
	
	private SessionFactory sessionFactory; 
	
	public HibernateSessionFactory () {
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		try {
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		}catch(Exception e) {
			StandardServiceRegistryBuilder.destroy(registry);
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	} 
	
	public SessionFactory getSessionFactory() {
		return this.sessionFactory;
	}
}
