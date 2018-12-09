package com.mexicacode.puntoventa.services;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.mexicacode.puntoventa.pojos.User;

public class AuthenticationServiceTest {

	@Test
	public void testIsValidUser() {
		AuthenticationService authServ = new AuthenticationService();
		Boolean value = authServ.isValidUser(new User("mangore","d5552efb896c52bdcaf953e7549c3872"));
		System.out.println(value);
		Assert.assertTrue(value);
	}

}
