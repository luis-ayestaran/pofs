package com.mexicacode.puntoventa.hbm;

import static org.junit.Assert.*;

import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HibernateSessionFactoryTest {
	private SessionFactory sessionFactory;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		sessionFactory = new HibernateSessionFactory().getSessionFactory();
	} 

	@After
	public void tearDown() throws Exception {
		if(sessionFactory != null) {
			sessionFactory.close();
		}
	}

	@Test
	public void testGetSessionFactory() {
		assertNotNull(sessionFactory);
	}

}
