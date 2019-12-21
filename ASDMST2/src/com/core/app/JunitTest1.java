package com.core.app;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitTest1 {
TestNumber tn = new TestNumber(0);
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNumLessthanZero() {
		tn.StoreNumber();
		assertTrue(tn.getNumber()<=0);
		System.out.println(tn.getNumber());
	}
	@Test
	public void testNumgreaterthanZero1() {
		tn.StoreNumber();
		assertTrue(tn.getNumber()>=0);
		System.out.println(tn.getNumber());
	}
	@Test
	public void testNumgreaterthanhundred() {
		tn.StoreNumber();
		assertTrue(tn.getNumber()<=100);
		System.out.println(tn.getNumber());
	}
}
