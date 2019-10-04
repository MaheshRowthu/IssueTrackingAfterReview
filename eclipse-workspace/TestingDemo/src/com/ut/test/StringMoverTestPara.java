/**
 * 
 */
package com.ut.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

	@RunWith(Parameterized.class)
	public class StringMoverTestPara{
		private String input;
		private String expectedResult;
		private StringMover obj;
	
	
	@Before
	public void initialize() {
		obj =new StringMover();
	}
	public StringMoverTestPara(String input,String expectedResult) {
		this.input=input;
		this.expectedResult=expectedResult;
	}

	@Parameterized.Parameters
	public static Collection primeNumbers() {
		List<String[]> list=new ArrayList<>();
		list.add(new String[] {"hello","lohel"});
		list.add(new String[] {"dinesh","shdine"});
		list.add(new String[] {"ab","ab"});
		
		return list;
		
	}
	@Test
	public void testMoveLastTwo() {
	
	System.out.println(input);
	assertEquals(expectedResult,obj.moveLastTwo(input) );}

}
