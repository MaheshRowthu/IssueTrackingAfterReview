package com.ut.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RandomNumbersTest {

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
	}

	@Test
	public void testGet10randomNumbers() {
	RandomNumbers obj3=new RandomNumbers();
	int low=5,high=23;
	int output[]=obj3.get10randomNumbers(low,high);
	assertEquals(output.length,10 );
	for(int x:output) {
		if(x>low && x<high) {
			
		}
		else {
			assertNotEquals(true,true);
			
		}
	}
	
	
	}

}
