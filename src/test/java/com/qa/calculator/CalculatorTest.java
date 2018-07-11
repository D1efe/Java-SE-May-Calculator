package com.qa.calculator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.qa.subtraction.Subtraction;

public class CalculatorTest {

	private Subtraction subtract;
	
	@BeforeClass
	public void setUp() {
		subtract = new Subtraction();
	}

	@Test
	public void subtractTest() {

		int expectedResult;
		int actualResult = Subtraction.subtract();
		
		assertEquals(expectedResult, actualResult);
		
	}

}
