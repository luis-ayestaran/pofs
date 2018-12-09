package com.mexicacode.puntoventa.utils;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.mexicacode.puntoventa.exceptions.ToolkitException;

public class ToolkitTest {

	@Test
	public void testStrToMD5() {
		String test = "D5552EFB896C52BDCAF953E7549C3872";
		try {
			Assert.assertTrue(test.equals(Toolkit.strToMD5("1nt3rm3zz0$")));
		} catch (ToolkitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}

}
