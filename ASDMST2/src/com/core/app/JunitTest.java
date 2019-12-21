package com.core.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;

class JunitTest {
	 //TestNumber tn= new TestNumber(05);
	TestNumber tn=null;
	@Before
	void setUp() throws Exception {
	}

	@After
	void tearDown() throws Exception {
	}

	/*
	 * @Test void testStoreNumber() { TestNumber tn= new TestNumber(01);
	 * assertEquals(true,tn.getNumber()>=0); System.out.println(tn.getNumber());
	 * 
	 * assertEquals(tn.StoreNumber(), tn.getNumber());
	 * System.out.println(tn.getNumber());
	 * 
	 * //*fail("Not yet implemented");
	 * 
	 * }
	 * 
	 * @Test void testStoreNumber1() { TestNumber tn= new TestNumber(-5);
	 * assertEquals(true,tn.getNumber()<=0); System.out.println(tn.getNumber()); }
	 * 
	 * @Test void testStoreNumber2() { TestNumber tn= new TestNumber(1000);
	 * assertEquals(tn.StoreNumber(),tn.getNumber());
	 * System.out.println(tn.getNumber()); }
	 */
	@Test
	public void testNumLessthanZero()
	{
		tn.StoreNumber();
		assertTrue(tn.getNumber()<=0);
	}

	
	
}
