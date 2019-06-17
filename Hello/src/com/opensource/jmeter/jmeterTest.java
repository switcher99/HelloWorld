package com.opensource.jmeter;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class jmeterTest {
	private jmeter Jmeter=new jmeter();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testgetName() {
		
		Jmeter.setName();
		assertEquals("Zhang",Jmeter.getName());
	}

	@Test
	public void testgetFriend() {
		
		Jmeter.setFriend();
		assertEquals("Lee",Jmeter.getFriend());
	}

}
