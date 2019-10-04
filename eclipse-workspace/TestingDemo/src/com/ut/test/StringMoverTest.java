package com.ut.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class StringMoverTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	
	@Before
	public void setUp() throws Exception {
		}
	

	@After
	public void tearDown() throws Exception {
		System.out.println();
	}

	@Test
	public void testtogetmoveLastTwo() {
		StringMover obj2=new StringMover();
	String output=obj2.moveLastTwo("mahesh");
	assertEquals("shmahe", output);
	assertNotEquals(null, output);
	}

}
