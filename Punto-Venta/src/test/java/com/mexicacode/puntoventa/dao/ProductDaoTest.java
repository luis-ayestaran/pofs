package com.mexicacode.puntoventa.dao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.mexicacode.puntoventa.exceptions.DaoException;
import com.mexicacode.puntoventa.pojos.Product;

public class ProductDaoTest {
	
	private Product product;
	private ProductDao productDao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		product = new Product("ProductTest01","BrandTest01","TypeTest01");
		productDao = new ProductDao();
		productDao.save(product);
	}

	@After
	public void tearDown() throws Exception {
		
	}
	
	@Test 
	public void testFind() {
		Product productTest = new Product (product.getId(),"ProductTest","Brand Test","TypeTest");
		try {
			productDao.find(productTest);
			System.out.println(productTest.toString());
			System.out.println(product.toString());
			Assert.assertTrue(productTest.getId()==product.getId());
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}
	

	/*@Test
	public void testGet() {
		fail("Not yet implemented");
	}*/

}
