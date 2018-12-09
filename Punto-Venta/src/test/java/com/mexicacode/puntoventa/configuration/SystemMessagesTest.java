package com.mexicacode.puntoventa.configuration;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.mexicacode.puntoventa.exceptions.SystemConfigException;

public class SystemMessagesTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetMessage() {
		String messageTest = "No fue posible guardar el registro en la base de datos";
		String strKey = "exception.1002";
		String propertie;
		try {
			propertie = SystemMessages.getMessage(strKey);
			Assert.assertTrue("Propiedad: exception.1001 <Los valores comparados no son iguales>",propertie.equals(messageTest));
		} catch (SystemConfigException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.assertTrue(false); 
		} catch (Exception e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}
}
