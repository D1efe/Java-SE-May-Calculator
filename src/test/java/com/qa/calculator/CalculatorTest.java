package com.qa.calculator;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

import com.qa.subtraction.Subtraction;

public class CalculatorTest {

	private static Subtraction subtraction;
	
	@BeforeClass
	public static void setUp() {
		subtraction = new Subtraction();
	}

	@Test
	public void subtractTest() {

		
		int actualResult = subtraction.subtract(9, 4);
		
		assertEquals(5, actualResult);
		
	}

}
