package com.core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitTester {
  Employee emp= new Employee();
	@Before
	public void setUp() throws Exception {
		System.out.println("Before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After");
	}

	@Test
	public void testSetId() {
		assertEquals("operation sucessfull", emp.setId("12345"));
		System.out.println(emp.getId());
	}

	@Test
	public void testSetName() {
		assertEquals("operation sucessfull", emp.setName("onkar"));
		System.out.println(emp.getName());
	}

	@Test
	public void testSetSal() {
	assertEquals("operation sucessfull", emp.setSal(45124));	
	System.out.println(emp.getSal());
	}

	@Test
	public void testSetDept() {
		assertEquals("operation sucessfull", emp.setDept("Research"));
		System.out.println(emp.getDept());
	}

}
